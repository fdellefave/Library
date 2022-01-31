package it.fdellefave.library.controller;


import it.fdellefave.library.model.AuthorEntity;
import it.fdellefave.library.model.BookEntity;
import it.fdellefave.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController implements Controller<AuthorEntity> {

    @Autowired
    private AuthorService service;

    @GetMapping("/getAll")
    public Iterable<AuthorEntity> getAll() {

        return service.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<AuthorEntity> getById(@PathVariable int id) {

        return service.getById(id);
    }


    @PostMapping("/create")
    public AuthorEntity create(@RequestBody AuthorEntity author) {

        return service.create(author);
    }


    @PutMapping("/update/{id}")
    public AuthorEntity update(@RequestBody AuthorEntity author, @PathVariable int id) {

        return service.update(id, author).get();
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable int id) {
        Boolean flag = service.delete(id);
        return flag;
    }
}