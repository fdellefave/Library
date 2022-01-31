package it.fdellefave.library.repository;

import it.fdellefave.library.model.BookNumberEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BookNumberRepository extends CrudRepository<BookNumberEntity,Integer> {
}
