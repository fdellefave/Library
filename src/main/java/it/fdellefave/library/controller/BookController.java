package it.fdellefave.library.controller;

import it.fdellefave.library.model.Book;
import it.fdellefave.library.model.Library;
import it.fdellefave.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController implements Controller<Book>{

    @Autowired
    private BookService service;

    @GetMapping("/getAll")
    public Iterable<Book> getAll() {

        return service.getAll();
    }


    @GetMapping("/getById/{id}")
    public Optional<Book> getById(@PathVariable int id) {

        return service.getById(id);
    }


    @PostMapping("/create")
    public Book create(@RequestBody Book book) {

        return service.create(book);
    }


    @PutMapping("/update/{id}")
    public Book update(@RequestBody Book book, @PathVariable int id) {

        return service.update(id, book).get();
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable int id){
        Boolean flag = service.delete(id);
        return flag;
    }
}
