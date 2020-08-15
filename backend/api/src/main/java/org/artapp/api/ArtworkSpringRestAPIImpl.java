package org.artapp.api;

import org.artapp.domain.Artwork;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.artapp.services.CollectionService;

import java.sql.SQLException;
import java.util.List;

@RestController
public class ArtworkSpringRestAPIImpl implements ArtworkSpringRestAPI {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArtworkSpringRestAPIImpl.class);

    @Override
    public void create(@RequestBody Artwork artwork) {

        try {
            LOGGER.debug("Creating a new artwork with title: {}", artwork.getName());
            CollectionService collectionService = new org.artapp.services.CollectionService();
            collectionService.createArtwork(artwork);
        } catch(SQLException e ) {
            //TODO: properly manage exception
            LOGGER.error("Error inserting new artwork in database", e);
        }
    }

    @Override
    @CrossOrigin
    public List<Artwork> list() {
        List<Artwork> artworks = null;

        try {
            CollectionService collectionService = new CollectionService();
            artworks = collectionService.readArtCollection().getContent();
        } catch (SQLException e) {
            LOGGER.error("Error while retrieving artworks", e);
        }

        return artworks;
    }

}
