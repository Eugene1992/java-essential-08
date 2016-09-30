package com.cbs.edu.generics;

import java.util.List;

public interface GenericDAO<E> {

    E get(int id);

    List<E> getAll();

    void create(E e);

    void delete(int id);

    void update(E e);
}
