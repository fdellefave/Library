package it.fdellefave.library.controller;

import it.fdellefave.library.adapter.BookAdapter;
import it.fdellefave.library.api.BookApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/adapter")
public class BookApiController {


    @Autowired
    private BookAdapter adapter;


    @PostMapping(value = "/create", consumes={"application/json"})
    public BookApi createAdapter(@RequestBody BookApi bookApi) {
        return adapter.create(bookApi);
    }

    @GetMapping(value = "/getAll")
    public List<BookApi> getAllAdapter(){
        return adapter.getAll();
    }

    @GetMapping(value = "/iterationBook")
    public BookApi iterationBook(){ return adapter.iterationBook();}

}
