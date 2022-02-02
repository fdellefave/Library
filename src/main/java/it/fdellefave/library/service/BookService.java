package it.fdellefave.library.service;

import it.fdellefave.library.model.BookEntity;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Iterable<BookEntity> getAll();

    Optional<BookEntity> getById(int id);

    BookEntity create(BookEntity book);

    Optional<BookEntity> update(int id, BookEntity bookEntity);

    Boolean delete(int id);

    List<BookEntity> iterationBookByClick();

    BookEntity bookIteration();


}
