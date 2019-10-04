package org.artapp;

import java.util.ArrayList;
import java.util.List;

public class ArtCollection {

    List<Artwork> content;

    public ArtCollection() {
        this.content = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        content.add(artwork);
    }
}
