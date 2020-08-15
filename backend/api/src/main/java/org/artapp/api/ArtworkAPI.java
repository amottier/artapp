package org.artapp.api;

import org.artapp.domain.Artwork;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ArtworkAPI {
    void create(Artwork artwork);

    List<Artwork> list();
}
