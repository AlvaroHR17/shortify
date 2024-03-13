package com.alvarohdr.shortifyapi.domain.dao.hibernate;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDaoSupport {

    protected SessionFactory sessionFactory;
    protected EntityManager em;

    protected Session getSession() {
        return sessionFactory.openSession();
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
