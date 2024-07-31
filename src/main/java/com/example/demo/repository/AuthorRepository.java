package com.example.demo.repository;

import com.example.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Collection;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
    Collection<Author> findByNameContaining(String name);
}