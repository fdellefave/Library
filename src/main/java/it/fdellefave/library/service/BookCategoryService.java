package it.fdellefave.library.service;


import it.fdellefave.library.model.BookCategoryEntity;

import java.util.Optional;

public interface BookCategoryService {

    Iterable<BookCategoryEntity> getAll();

    Optional<BookCategoryEntity> getById(int id);

    BookCategoryEntity create(BookCategoryEntity bookCategory);

    Optional<BookCategoryEntity> update(int id, BookCategoryEntity bookCategory);

    Boolean delete(int id);


}
