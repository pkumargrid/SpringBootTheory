package org.example.spring6webapp.services;

import org.example.spring6webapp.domain.Author;
import org.example.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
