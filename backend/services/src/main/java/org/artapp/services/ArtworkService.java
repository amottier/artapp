package org.artapp.services;

import org.artapp.dataaccess.ArtworkDataAccess;
import org.artapp.dataaccess.jdbc.ArtworkDataAccessJDBC;
import org.artapp.domain.Artwork;


public class ArtworkService {

    private final ArtworkDataAccess artworkDataAccess;

    public ArtworkService() {
        artworkDataAccess = new ArtworkDataAccessJDBC();
    }

    public void save(Artwork artwork) {
        artworkDataAccess.save(artwork);
    }

    public Iterable<Artwork> findAll() {
        return artworkDataAccess.findAll();
    }
}
