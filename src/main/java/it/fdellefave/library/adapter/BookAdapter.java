package it.fdellefave.library.adapter;

import it.fdellefave.library.api.BookApi;
import it.fdellefave.library.model.BookEntity;
import it.fdellefave.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
                responseEntity.getIdBook(),
                responseEntity.getTitle(),
                responseEntity.getDescription(),
                responseEntity.getPrice(),
                responseEntity.getQuantity(),
                responseEntity.getBookCategoryEntity()
                );
        //ritorno l'api.
        return responseApi;
    }

    public List<BookApi> getAll(){

        //instanzio la request entity
        Iterable<BookEntity> requestEntity = service.getAll();
        Iterator<BookEntity> iter = requestEntity.iterator();


        //Creo la lista di ritorno
        List<BookApi> responseApi = new ArrayList<BookApi>();

        while(iter.hasNext()){
            BookEntity entity = iter.next();
            BookApi book = new BookApi(
                    entity.getIdBook(),
                    entity.getTitle(),
                    entity.getDescription(),
                    entity.getPrice(),
                    entity.getQuantity(),
                    entity.getBookCategoryEntity()
            );
           responseApi.add(book);
        }

        return responseApi;
        }

}
