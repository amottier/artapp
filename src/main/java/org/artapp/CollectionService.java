package org.artapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CollectionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CollectionService.class);

    public int numberOfArtwork(ArtCollection artCollection) {
        LOGGER.debug("artCollection size: ${}", artCollection.content.size());
        return artCollection.content.size();
    }

}
