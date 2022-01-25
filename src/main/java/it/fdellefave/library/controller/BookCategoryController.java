package it.fdellefave.library.controller;

import it.fdellefave.library.model.BookCategoryEntity;
import it.fdellefave.library.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookCategoryController implements Controller<BookCategoryEntity>{

    @Autowired
    private BookCategoryService service;

    @GetMapping("/getAll")
    public Iterable<BookCategoryEntity> getAll() {

        return service.getAll();
    }


    @GetMapping("/getById/{id}")
    public Optional<BookCategoryEntity> getById(@PathVariable int id) {

        return service.getById(id);
    }


    @PostMapping("/create")
    public BookCategoryEntity create(@RequestBody BookCategoryEntity book) {

        return service.create(book);
    }


    @PutMapping("/update/{id}")
    public BookCategoryEntity update(@RequestBody BookCategoryEntity book, @PathVariable int id) {

        return service.update(id, book).get();
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable int id){
        Boolean flag = service.delete(id);
        return flag;
    }
}
