package it.fdellefave.library.repository;

import it.fdellefave.library.model.AuthorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity,Integer> {
}
