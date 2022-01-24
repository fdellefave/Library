package it.fdellefave.library.controller;


import it.fdellefave.library.model.Author;
import it.fdellefave.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController implements Controller<Author> {

    @Autowired
    private AuthorService service;

    @Override
    public Iterable<Author> getAll() {
        return service.getAll();
    }

    @Override
    public Optional<Author> getById(int id) {
        return service.getById(id);
    }

    @Override
    public Author create(Author element) {
        return null;
    }

    @Override
    public Author update(Author element, int id) {
        return null;
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
