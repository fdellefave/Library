package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.Library;
import it.fdellefave.library.service.LibraryService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryServiceImplement implements LibraryService {

    @Override
    public Iterable<Library> getAll() {
        return null;
    }

    @Override
    public Optional<Library> getById(int id) {
        return Optional.empty();
    }

    @Override
    public Library create(Library library) {
        return null;
    }

    @Override
    public Optional<Library> update(int id, Library library) {
        return Optional.empty();
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
