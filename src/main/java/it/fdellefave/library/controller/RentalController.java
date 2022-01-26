package it.fdellefave.library.controller;


import it.fdellefave.library.model.RentalEntity;
import it.fdellefave.library.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rental")
public class RentalController implements Controller<RentalEntity> {

    @Autowired
    private RentalService service;

    @GetMapping("/getAll")
    public Iterable<RentalEntity> getAll() {

        return service.getAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<RentalEntity> getById(@PathVariable int id) {

        return service.getById(id);
    }


    @PostMapping("/create")
    public RentalEntity create(@RequestBody RentalEntity rental) {

        return service.create(rental);
    }


    @PutMapping("/update/{id}")
    public RentalEntity update(@RequestBody RentalEntity rental, @PathVariable int id) {

        return service.update(id, rental).get();
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable int id) {
        Boolean flag = service.delete(id);
        return flag;
    }
}