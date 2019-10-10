package com.hireright.chanllenge.data;

public interface BaseDao<T> {

    void create(T t);

    T update(T t);

    void delete(T t);

    T get(String id);
}
