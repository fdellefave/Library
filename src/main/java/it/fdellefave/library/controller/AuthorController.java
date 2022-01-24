package it.fdellefave.library.controller;


import it.fdellefave.library.model.AuthorEntity;
import it.fdellefave.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController implements Controller<AuthorEntity> {

    @Autowired
    private AuthorService service;

    @Override
    public Iterable<AuthorEntity> getAll() {
        return service.getAll();
    }

    @Override
    public Optional<AuthorEntity> getById(int id) {
        return service.getById(id);
    }

    @Override
    public AuthorEntity create(AuthorEntity element) {
        return null;
    }

    @Override
    public AuthorEntity update(AuthorEntity element, int id) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
