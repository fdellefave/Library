package it.fdellefave.library.controller;

import it.fdellefave.library.model.BookEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public interface Controller<T> {

     Iterable<T> getAll();

     Optional<T> getById(@PathVariable int id);

     T create(@RequestBody T element);

     T update(@RequestBody T element, @PathVariable int id);

     Boolean delete(@PathVariable int id);

     //ResponseEntity<BookEntity> create2(@RequestBody BookEntity book);


}
