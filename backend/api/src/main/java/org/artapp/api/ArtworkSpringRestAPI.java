package org.artapp.api;

import org.artapp.domain.Artwork;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

interface ArtworkSpringRestAPI extends ArtworkAPI {
    @PostMapping("/artwork")
    void create(@RequestBody Artwork artwork);

    @GetMapping("/artworks")
    List<Artwork> list();
}
