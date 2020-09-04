package org.artapp.dataaccess.jdbc;

import org.artapp.dataaccess.ArtworkDataAccess;
import org.artapp.domain.ArtCollection;
import org.artapp.domain.Artwork;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class ArtworkDataAccessJDBC implements ArtworkDataAccess {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArtworkDataAccessJDBC.class);
    private Connection db = null;

    public ArtworkDataAccessJDBC() {
        try {
            db = DriverManager.getConnection("jdbc:postgresql://localhost/artapp", "artapp-main", "oiseau");
        } catch (SQLException e) {
            LOGGER.error("Error while initializing database connection", e);
        }
    }

    @Override
    public void save(Artwork artwork) {

        try {
            PreparedStatement preparedStatement = db.prepareStatement("INSERT INTO artwork (name, creation_date, sold, dimensions, medium) VALUES(?, ?, ?, ?, ?)");
            preparedStatement.setString(1, artwork.getName());
            preparedStatement.setObject(2, artwork.getCreationDate());
            preparedStatement.setBoolean(3, artwork.isSold());
            preparedStatement.setString(4, artwork.getDimensions());
            preparedStatement.setString(5, artwork.getMedium());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error while saving artwork", e);
        }

    }

    @Override
    public Iterable<Artwork> findAll() {
        ArtCollection artCollection = new ArtCollection();

        try {
            Statement statement = db.createStatement();
            if (statement.execute("SELECT id, name FROM artwork")) {
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    Artwork artwork = new Artwork();
                    artwork.setId(resultSet.getInt(1));
                    artwork.setName(resultSet.getString(2));
                    artCollection.addArtwork(artwork);
                }
            } else {
                LOGGER.warn("Empty collection");
            }
        } catch (SQLException e) {
            LOGGER.error("Error while getting artworks from database", e);
        }

        return artCollection.getContent();
    }

    @Override
    public int count() {
        //LOGGER.debug("artCollection size: ${}", artCollection.getContent().size());
        //FIXME: to implement
        LOGGER.error("Not implemented");
        return 0;
        //return artCollection.getContent().size();
    }
}
