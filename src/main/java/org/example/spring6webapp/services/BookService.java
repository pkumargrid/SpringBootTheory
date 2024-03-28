package org.example.spring6webapp.services;

import org.example.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
