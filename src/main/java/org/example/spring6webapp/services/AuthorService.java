package org.example.spring6webapp.services;

import org.example.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
