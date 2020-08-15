package org.artapp.services;

import org.artapp.domain.ArtCollection;
import org.artapp.domain.Artwork;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class CollectionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CollectionService.class);
    private final Connection db;

    public CollectionService() throws SQLException {
        db = DriverManager.getConnection("jdbc:postgresql://localhost/artapp", "artapp-main", "oiseau");
    }

    public void createArtwork(Artwork artwork) throws SQLException {
        PreparedStatement preparedStatement = db.prepareStatement("INSERT INTO artwork (name) VALUES(?)");
        preparedStatement.setString(1, artwork.getName());
        preparedStatement.executeUpdate();
    }

    public ArtCollection readArtCollection() throws SQLException {
        ArtCollection artCollection = new ArtCollection();

        Statement statement = db.createStatement();
        if(statement.execute("SELECT id, name FROM artwork")) {
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

        return artCollection;
    }

    public int numberOfArtwork(ArtCollection artCollection) {
        LOGGER.debug("artCollection size: ${}", artCollection.getContent().size());
        return artCollection.getContent().size();
    }

}
