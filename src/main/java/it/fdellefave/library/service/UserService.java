package it.fdellefave.library.service;

import it.fdellefave.library.model.UserEntity;

import java.util.Optional;

public interface UserService {

    Iterable<UserEntity> getAll();

    Optional<UserEntity> getById(int id);

    UserEntity create(UserEntity userEntity);

    Optional<UserEntity> update(int id, UserEntity userEntity);

    Boolean delete(int id);
}
