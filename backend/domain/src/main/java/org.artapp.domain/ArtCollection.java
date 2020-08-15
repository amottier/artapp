package org.artapp.domain;

import java.util.ArrayList;
import java.util.List;

public class ArtCollection {

    private List<Artwork> content;

    public ArtCollection() {
        this.content = new ArrayList<>();
    }

    public void addArtwork(Artwork artwork) {
        content.add(artwork);
    }

    public List<Artwork> getContent() {
        return content;
    }
}
