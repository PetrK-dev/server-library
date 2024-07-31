package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.domain.BookStatus;
import com.example.demo.repository.BookRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BookServiceImpl extends CrudServiceImpl<Book, Long> implements BookService{
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Collection<Book> getBooksByTitle(String title) {
        return bookRepository.findByTitleContaining(title);
    }

    public Collection<Book> getBooksByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    public Collection<Book> getBooksByAuthorName(String authorName) {
        return bookRepository.findByAuthorsName(authorName);
    }

    public Collection<Book> getBooksByCategoryName(String categoryName) {
        return bookRepository.findByCategoriesName(categoryName);
    }

    public Collection<Book> getBooksByStatus(BookStatus status) {
        return bookRepository.findByStatus(status);
    }

    @Override
    public Book update(Long id, Book bookDetails) {
        Optional<Book> book = this.bookRepository.findById(id);
        if (book.isPresent()) {
            Book updatedBook = book.get();
            updatedBook.setTitle(bookDetails.getTitle());
            updatedBook.setIsbn(bookDetails.getIsbn());
            updatedBook.setPublishedDate(bookDetails.getPublishedDate());
            updatedBook.setStatus(bookDetails.getStatus());
            updatedBook.setAuthors(bookDetails.getAuthors());
            updatedBook.setCategories(bookDetails.getCategories());
            bookRepository.save(updatedBook);
            return updatedBook;
        } else {
            return null;
        }
    }

    @Override
    protected CrudRepository<Book, Long> getRepository() {
        return this.bookRepository;
    }
}