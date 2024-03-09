package com.alvarohdr.shortifyapi.domain.dao.hibernate;

import com.alvarohdr.shortifyapi.domain.dao.LinkDAO;
import com.alvarohdr.shortifyapi.domain.model.Link;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Optional;

@Component
public class LinkHibernate extends AbstractDaoSupport implements LinkDAO {

    public Optional<Link> findByUri(String uri) {
        Session session = getSession();
        String query = "FROM " + Link.class.getName() + " WHERE uri = :uri";
        return session.createQuery(query, Link.class).setParameter("uri", uri).stream().findFirst();

    }
}
