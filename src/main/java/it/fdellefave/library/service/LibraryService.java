package it.fdellefave.library.service;

import it.fdellefave.library.model.LibraryEntity;

import java.util.Optional;

public interface LibraryService {

    Iterable<LibraryEntity> getAll();

    Optional<LibraryEntity> getById(int id);

    LibraryEntity create(LibraryEntity libraryEntity);

    Optional<LibraryEntity> update(int id, LibraryEntity libraryEntity);

    Boolean delete(int id);
}
