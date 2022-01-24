package it.fdellefave.library.service;

import it.fdellefave.library.model.Library;
import java.util.Optional;

public interface LibraryService {

    Iterable<Library> getAll();

    Optional<Library> getById(int id);

    Library create(Library library);

    Optional<Library> update(int id, Library library);

    Boolean delete(int id);
}
