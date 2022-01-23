package it.fdellefave.library.service;

import it.fdellefave.library.model.Book;

import java.util.Optional;

public interface BookService {

    Iterable<Book> getAll();

    Optional<Book> getById(int id);

    Book create(Book book);

    Optional<Book> update(int id, Book book);

    Boolean delete(int id);


}
