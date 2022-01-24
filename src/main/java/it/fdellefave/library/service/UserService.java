package it.fdellefave.library.service;

import it.fdellefave.library.model.User;

import java.util.Optional;

public interface UserService {

    Iterable<User> getAll();

    Optional<User> getById(int id);

    User create(User user);

    Optional<User> update(int id, User user);

    Boolean delete(int id);
}
