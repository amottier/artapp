package org.artapp.dataaccess;

import org.artapp.domain.Artwork;

public interface ArtworkDataAccess {
    public void save(Artwork artwork);

    public Iterable<Artwork> findAll();

    public int count();
}
