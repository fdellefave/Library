package it.fdellefave.library.service;

import it.fdellefave.library.model.BookNumberEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface BookNumberService {

    Iterable<BookNumberEntity> getAll();

    Optional<BookNumberEntity> getById(int id);

    BookNumberEntity create(BookNumberEntity bookNumber);

    Optional<BookNumberEntity> update(int id, BookNumberEntity bookNumber);

    Boolean delete(int id);


}
