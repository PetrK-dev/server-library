package com.example.demo.controller;

import com.example.demo.domain.Book;
import com.example.demo.domain.BookStatus;
import com.example.demo.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;

    public BookController (BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public Iterable<Book> getAllBooks() {
        return bookService.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Optional<Book> book = bookService.readById(id);
        if (book.isPresent()) {
            return ResponseEntity.ok(book.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search")
    public Collection<Book> getBooksByTitle(@RequestParam String title) {
        return bookService.getBooksByTitle(title);
    }

    @GetMapping("/isbn/{isbn}")
    public Collection<Book> getBooksByIsbn(@PathVariable String isbn) {
        return bookService.getBooksByIsbn(isbn);
    }

    @GetMapping("/author")
    public Collection<Book> getBooksByAuthorName(@RequestParam String authorName) {
        return bookService.getBooksByAuthorName(authorName);
    }

    @GetMapping("/category")
    public Collection<Book> getBooksByCategoryName(@RequestParam String categoryName) {
        return bookService.getBooksByCategoryName(categoryName);
    }

    @GetMapping("/status")
    public Collection<Book> getBooksByStatus(@RequestParam BookStatus status) {
        return bookService.getBooksByStatus(status);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.create(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        Book updatedBook = bookService.update(id, bookDetails);
        if (updatedBook != null) {
            return ResponseEntity.ok(updatedBook);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteById(id);
    }
}

