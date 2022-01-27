package it.fdellefave.library.controller;

import it.fdellefave.library.model.BookEntity;
import it.fdellefave.library.response.BookResponse;
import it.fdellefave.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
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

    @Override
    public BookEntity create(BookEntity element) {
        return null;
    }


//    @PostMapping(value = "/create", consumes={"application/json"})
//    public ResponseEntity<BookEntity> create(@RequestBody BookEntity book) {
//
//        service.create(book);
//
//        return new ResponseEntity<BookEntity>(book, HttpStatus.OK);
//    }

    @PostMapping(value = "/create2", consumes={"application/json"})
    public ResponseEntity<BookEntity> create2(@RequestBody BookEntity book) {

        service.create(book);

        return null;// new ResponseEntity<BookResponse>(book, HttpStatus.OK);
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
