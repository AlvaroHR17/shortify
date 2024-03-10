package com.alvarohdr.shortifyapi.domain.service.impl;

import com.alvarohdr.shortifyapi.domain.dao.LinkDAO;
import com.alvarohdr.shortifyapi.domain.model.Link;
import com.alvarohdr.shortifyapi.domain.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LinkServiceImpl implements LinkService {

    private final LinkDAO linkDAO;

    @Autowired
    public LinkServiceImpl(LinkDAO linkDAO) {
        this.linkDAO = linkDAO;
    }

    @Override
    public Optional<Link> findByUri(String uri) {
        return linkDAO.findByUri(uri);
    }

    @Override
    public Optional<Link> findByUrl(String url) {
        return linkDAO.findByUrl(url);
    }

    @Override
    public void save(Link link) {
        linkDAO.saveOrUpdate(link);
    }
}
