package it.fdellefave.library.controller;

import it.fdellefave.library.api.BookApi;
import it.fdellefave.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//(REQUEST) FE -> API -> [ADAPTER API] to ENTITY -> ENTITY -> REPO

//REPO -> ENTITY -> [ADAPTER ENTITY] to API -> API -> FE (RESPONSE)

@RestController
@RequestMapping("/book")
public class BookProvaApiController implements Controller<BookApi>{



    @GetMapping("/getAll")
    public Iterable<BookApi> getAll() {

        return service.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<BookApi> getById(@PathVariable int id) {

        return service.getById(id);
    }


    @PostMapping("/create")
    public BookApi create(@RequestBody BookApi book) {

        return service.create(book);
    }


    @PutMapping("/update/{id}")
    public BookApi update(@RequestBody BookApi book, @PathVariable int id) {

        return service.update(id, book).get();
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable int id){
        Boolean flag = service.delete(id);
        return flag;
    }
}
