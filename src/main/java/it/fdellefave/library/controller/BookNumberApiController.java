package it.fdellefave.library.controller;

import it.fdellefave.library.adapter.BookNumberAdapter;
import it.fdellefave.library.api.BookApi;
import it.fdellefave.library.api.BookNumberApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookNumber/adapter")
public class BookNumberApiController {


    @Autowired
    private BookNumberAdapter adapter;


    @PostMapping(value = "/create", consumes={"application/json"})
    public BookNumberApi createAdapter(@RequestBody BookNumberApi bookNumberApi) {
        return adapter.create(bookNumberApi);
    }

    @GetMapping(value = "/getAll")
    public List<BookNumberApi> getAllAdapter(){
        return adapter.getAll();
    }
}
