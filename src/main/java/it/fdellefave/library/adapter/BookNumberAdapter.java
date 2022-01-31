package it.fdellefave.library.adapter;

import it.fdellefave.library.api.BookNumberApi;
import it.fdellefave.library.model.BookNumberEntity;
import it.fdellefave.library.service.BookNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class BookNumberAdapter {

    private int idBookNumber;
    private int isbnCode;


    @Autowired
    private BookNumberService service;

    public BookNumberApi create(BookNumberApi requestAPI) {

        //creo un entity da un'api
        BookNumberEntity requestEntity = new BookNumberEntity(
                requestAPI.getIsbnCode(),
                requestAPI.getBookEntity());

        //passo entity al service che ritorna un entity
        BookNumberEntity responseEntity = service.create(requestEntity);

        //creo un api dalla responseEntity che arriva dal service
        BookNumberApi responseApi = new BookNumberApi(
                responseEntity.getIdBookNumber(),
                responseEntity.getIsbnCode(),
                responseEntity.getBookEntity()
        );
        //ritorno l'api.
        return responseApi;
    }

    public List<BookNumberApi> getAll(){

        //instanzio la request entity
        Iterable<BookNumberEntity> requestEntity = service.getAll();
        Iterator<BookNumberEntity> iter = requestEntity.iterator();


        //Creo la lista di ritorno
        List<BookNumberApi> responseApi = new ArrayList<BookNumberApi>();

        while(iter.hasNext()){
            BookNumberEntity entity = iter.next();
            BookNumberApi bookNumber = new BookNumberApi(
                    entity.getIdBookNumber(),
                    entity.getIsbnCode(),
                    entity.getBookEntity()
            );
            responseApi.add(bookNumber);
        }

        return responseApi;
    }
}
