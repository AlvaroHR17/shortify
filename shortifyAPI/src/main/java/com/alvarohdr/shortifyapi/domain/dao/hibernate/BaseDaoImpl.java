package com.alvarohdr.shortifyapi.domain.dao.hibernate;

import com.alvarohdr.shortifyapi.domain.dao.BaseDao;
import jakarta.transaction.Transactional;
import org.hibernate.Session;

public abstract class BaseDaoImpl<T> extends AbstractDaoSupport implements BaseDao<T> {

    @Transactional
    public void saveOrUpdate(T object) {
        em.merge(object);
    }
}
