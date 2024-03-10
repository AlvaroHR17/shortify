package com.alvarohdr.shortifyapi.domain.service;

import com.alvarohdr.shortifyapi.domain.model.Link;

import java.util.Optional;

public interface LinkService {
    Optional<Link> findByUri(String uri);
    Optional<Link> findByUrl(String url);

    void save(Link link);
}
