package it.fdellefave.library.controller;


import it.fdellefave.library.model.User;
import it.fdellefave.library.repository.UserRepository;
import it.fdellefave.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController implements Controller<User> {

    @Autowired
    private UserService service;

    @Override
    @RequestMapping("/getAll")
    public Iterable<User> getAll() {
        return service.getAll();
    }

    @Override
    @RequestMapping("/getById")
    public Optional<User> getById(int id) {
        return Optional.empty();
    }

    @Override
    @RequestMapping("/create")
    public User create(User element) {
        return null;
    }

    @Override
    @RequestMapping("/update/{id}")
    public User update(@RequestBody User element, @PathVariable int id) {
        return null;
    }

    @Override
    @RequestMapping("/delete/{id}")
    public Boolean delete(@PathVariable int id) {
        return null;
    }
}