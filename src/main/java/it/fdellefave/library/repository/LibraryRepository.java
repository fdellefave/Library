package it.fdellefave.library.repository;

import it.fdellefave.library.model.LibraryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CrudRepository<LibraryEntity,Integer> {
}
