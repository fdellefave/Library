package it.fdellefave.library.controller;


import it.fdellefave.library.model.UserEntity;
import it.fdellefave.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController implements Controller<UserEntity> {


        @Autowired
        private UserService service;

        @GetMapping("/getAll")
        public Iterable<UserEntity> getAll() {

            return service.getAll();
        }

        @GetMapping("/getById/{id}")
        public Optional<UserEntity> getById(@PathVariable int id) {

            return service.getById(id);
        }


        @PostMapping("/create")
        public UserEntity create(@RequestBody UserEntity user) {

            return service.create(user);
        }


        @PutMapping("/update/{id}")
        public UserEntity update(@RequestBody UserEntity user, @PathVariable int id) {

            return service.update(id, user).get();
        }

        @DeleteMapping("/delete/{id}")
        public Boolean delete(@PathVariable int id) {
            Boolean flag = service.delete(id);
            return flag;
        }
    }