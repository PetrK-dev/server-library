package com.example.demo.repository;

import com.example.demo.domain.Book;
import com.example.demo.domain.BookStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    Collection<Book> findByTitleContaining(String title);
    Collection<Book> findByIsbn(String isbn);
    Collection<Book> findByAuthorsName(String authorName);
    Collection<Book> findByCategoriesName(String categoryName);
    Collection<Book> findByStatus(BookStatus status);
}
