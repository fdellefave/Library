package it.fdellefave.library.service.implement;

import it.fdellefave.library.model.LibraryEntity;
import it.fdellefave.library.service.LibraryService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryServiceImplement implements LibraryService {

    @Override
    public Iterable<LibraryEntity> getAll() {
        return null;
    }

    @Override
    public Optional<LibraryEntity> getById(int id) {
        return Optional.empty();
    }

    @Override
    public LibraryEntity create(LibraryEntity libraryEntity) {
        return null;
    }

    @Override
    public Optional<LibraryEntity> update(int id, LibraryEntity libraryEntity) {
        return Optional.empty();
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
