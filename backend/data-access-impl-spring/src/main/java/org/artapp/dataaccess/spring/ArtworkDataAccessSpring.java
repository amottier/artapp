package org.artapp.dataaccess.spring;

import org.artapp.dataaccess.ArtworkDataAccess;
import org.artapp.domain.Artwork;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArtworkDataAccessSpring implements ArtworkDataAccess {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArtworkDataAccessSpring.class);

    @Override
    public void save(Artwork artwork) {

    }

    @Override
    public Iterable<Artwork> findAll() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
