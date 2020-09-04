package org.artapp.api;

import org.artapp.domain.Artwork;
import org.artapp.services.ArtworkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtworkSpringRestAPIImpl implements ArtworkSpringRestAPI {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArtworkSpringRestAPIImpl.class);

    @Override
    @CrossOrigin
    public void save(@RequestBody Artwork artwork) {

        LOGGER.debug("Creating a new artwork with title: {}", artwork.getName());
        ArtworkService collectionService = new ArtworkService();
        collectionService.save(artwork);

    }

    @Override
    @CrossOrigin
    public Iterable<Artwork> findAll() {
        List<Artwork> artworks = null;

        ArtworkService collectionService = new ArtworkService();
        return collectionService.findAll();
    }

}
