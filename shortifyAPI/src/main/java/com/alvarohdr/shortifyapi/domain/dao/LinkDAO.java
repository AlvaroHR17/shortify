package com.alvarohdr.shortifyapi.domain.dao;

import com.alvarohdr.shortifyapi.domain.model.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface LinkDAO {
    Optional<Link> findByUri(String uri);
}
