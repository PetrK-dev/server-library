package com.example.demo.service;

import com.example.demo.domain.Author;

import java.util.Collection;

public interface AuthorService extends CrudService<Author, Long>{
    Collection<Author> getsAuthorsByName(String name);
}