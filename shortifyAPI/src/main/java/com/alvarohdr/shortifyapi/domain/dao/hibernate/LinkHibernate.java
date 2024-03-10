package com.alvarohdr.shortifyapi.domain.dao.hibernate;

import com.alvarohdr.shortifyapi.domain.dao.LinkDAO;
import com.alvarohdr.shortifyapi.domain.model.Link;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LinkHibernate extends BaseDaoImpl<Link> implements LinkDAO {

    public Optional<Link> findByUri(String uri) {
        String query = "FROM " + Link.class.getName() + " WHERE uri = :uri";
        return getSession().createQuery(query, Link.class)
                .setParameter("uri", uri)
                .uniqueResultOptional();
    }

    public Optional<Link> findByUrl(String url) {
        String query = "FROM " + Link.class.getName() + " WHERE url = :url";
        return getSession().createQuery(query, Link.class)
                .setParameter("url", url)
                .uniqueResultOptional();
    }
}
