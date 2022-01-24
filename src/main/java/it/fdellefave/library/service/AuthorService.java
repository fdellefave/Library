package it.fdellefave.library.service;

import it.fdellefave.library.model.Author;
import it.fdellefave.library.model.Book;

import java.util.Optional;

public interface AuthorService {

    Iterable<Author> getAll();

    Optional<Author> getById(int id);

    Author create(Author author);

    Optional<Author> update(int id, Author author);

    Boolean delete(int id);


}
