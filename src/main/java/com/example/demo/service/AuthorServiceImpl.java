package com.example.demo.service;

import com.example.demo.domain.Author;
import com.example.demo.repository.AuthorRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class AuthorServiceImpl extends CrudServiceImpl<Author, Long> implements AuthorService{

    private AuthorRepository authorRepository;

    public AuthorServiceImpl (AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Collection<Author> getsAuthorsByName(String name) {
       return authorRepository.findByNameContaining(name);
    }

    @Override
    public Author update(Long id, Author authorDetails) {
        Optional<Author> optionalAuthor = authorRepository.findById(id);
        if (optionalAuthor.isPresent()) {
            Author author = optionalAuthor.get();
            author.setName(authorDetails.getName());
            author.setBiography(authorDetails.getBiography());
            author.setBooks(authorDetails.getBooks());
            return authorRepository.save(author);
        } else {
            return null;
        }
    }

    @Override
    protected CrudRepository<Author, Long> getRepository() {
        return this.authorRepository;
    }
}
