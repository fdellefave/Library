package it.fdellefave.library.repository;

import it.fdellefave.library.model.BookCategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryRepository extends CrudRepository<BookCategoryEntity,Integer> {


}