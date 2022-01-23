package it.fdellefave.library.repository;

import it.fdellefave.library.model.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CrudRepository<Library,Integer> {
}
