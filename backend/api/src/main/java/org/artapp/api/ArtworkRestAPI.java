package org.artapp.api;

import org.artapp.domain.Artwork;

public interface ArtworkRestAPI {
    void save(Artwork artwork);

    Iterable<Artwork> findAll();
}
