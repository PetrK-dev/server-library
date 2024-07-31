package com.example.demo.service;

import java.util.Optional;

public interface CrudService<T, ID> {
    T create(T e);
    Optional<T> readById(ID id);
    Iterable<T> readAll();
    T update(ID id, T e);
    void deleteById(ID id);
}

