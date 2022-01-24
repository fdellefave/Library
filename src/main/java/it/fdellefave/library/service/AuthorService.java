package it.fdellefave.library.service;


import it.fdellefave.library.model.AuthorEntity;

import java.util.Optional;

public interface AuthorService {

    Iterable<AuthorEntity> getAll();

    Optional<AuthorEntity> getById(int id);

    AuthorEntity create(AuthorEntity author);

    Optional<AuthorEntity> update(int id, AuthorEntity author);

    Boolean delete(int id);


}
