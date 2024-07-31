package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.domain.BookStatus;

import java.util.Collection;

public interface BookService extends CrudService<Book, Long>{
    Collection<Book> getBooksByTitle(String title);
    Collection<Book> getBooksByIsbn(String isbn);
    Collection<Book> getBooksByAuthorName(String authorName);
    Collection<Book> getBooksByCategoryName(String categoryName);
    Collection<Book> getBooksByStatus(BookStatus status);
}
