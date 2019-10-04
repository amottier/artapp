package org.artapp;

public class CollectionService {

    public int numberOfArtwork(ArtCollection artCollection) {
        return artCollection.content.size();
    }

}
