package com.alvarohdr.shortifyapi.domain.dao;

public interface BaseDao<T> {
    void saveOrUpdate(T obj);
}
