package com.alvarohdr.shortifyapi.domain.dao;

import com.alvarohdr.shortifyapi.domain.model.Link;

import java.util.Optional;

public interface LinkDAO extends BaseDao<Link>{
    Optional<Link> findByUri(String uri);
    Optional<Link> findByUrl(String uri);
}
