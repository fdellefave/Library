package it.fdellefave.library.repository;

import it.fdellefave.library.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
}
