package org.artapp.api;

import org.artapp.domain.Artwork;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

interface ArtworkSpringRestAPI extends ArtworkRestAPI {

    @Override
    @PostMapping("/artwork")
    void save(@RequestBody Artwork artwork);

    @Override
    @GetMapping("/artworks")
    Iterable<Artwork> findAll();
}
