package it.fdellefave.library.controller;

import it.fdellefave.library.model.BookEntity;
import it.fdellefave.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//(REQUEST) FE -> API -> [ADAPTER API] to ENTITY -> ENTITY -> REPO

//REPO -> ENTITY -> [ADAPTER ENTITY] to API -> API -> FE (RESPONSE)

@RestController
@RequestMapping("/book")
public class BookController implements Controller<BookEntity>{

    @Autowired
    private BookService service;

    @GetMapping("/getAll")
    public Iterable<BookEntity> getAll() {

        return service.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<BookEntity> getById(@PathVariable int id) {

        return service.getById(id);
    }


    @PostMapping(value = "/create", consumes={"application/json"})
    public BookEntity create(@RequestBody BookEntity book) {

        return service.create(book);
    }


    @PutMapping("/update/{id}")
    public BookEntity update(@RequestBody BookEntity book, @PathVariable int id) {

        return service.update(id, book).get();
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable int id){
        Boolean flag = service.delete(id);
        return flag;
    }
}
