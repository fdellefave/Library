package it.fdellefave.library.controller;

import it.fdellefave.library.model.Book;
import it.fdellefave.library.service.implement.BookServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServiceImplement bookService;

    @GetMapping("/getAll")
    public Iterable<Book> getAll() {

        return bookService.getAll();
    }


    @GetMapping("/getById/{id}")
    public Optional<Book> getById(@PathVariable int id) {

        return bookService.getById(id);
    }


    @PostMapping("/create")
    public Book create(@RequestBody Book book) {

        return bookService.create(book);
    }


    @PutMapping("/update/{id}")
    public Book update(@RequestBody Book book, @PathVariable int id) {

        return bookService.update(id, book).get();
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable int id){
        Boolean flag = bookService.delete(id);
        return flag;
    }
}
