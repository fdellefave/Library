package it.fdellefave.library.repository;

import it.fdellefave.library.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}