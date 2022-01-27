package it.fdellefave.library.adapter;

import it.fdellefave.library.api.BookApi;
import it.fdellefave.library.model.BookEntity;
import it.fdellefave.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookAdapter {

    @Autowired
    private BookService service;

    public BookApi create(BookApi requestAPI) {

        //creo un entity da un'api
        BookEntity requestEntity = new BookEntity(
                requestAPI.getTitle(),
                requestAPI.getDescription(),
                requestAPI.getPrice(),
                requestAPI.getQuantity(),
                requestAPI.getBookCategoryEntity());

        //passo entity al service che ritorna un entity
        BookEntity responseEntity = service.create(requestEntity);

        //creo un api dalla responseEntity che arriva dal service
        BookApi responseApi = new BookApi(
                responseEntity.getTitle(),
                responseEntity.getDescription(),
                responseEntity.getPrice(),
                responseEntity.getQuantity()
                );
        //ritorno l'api.
        return responseApi;
    }
}
