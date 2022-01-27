package it.fdellefave.library.adapter;

import it.fdellefave.library.api.BookApi;
import it.fdellefave.library.model.BookEntity;
import it.fdellefave.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BookAdapter implements ServiceAdapter<BookApi>{

    @Autowired
    private BookService service;

    public BookEntity bookAdapterEntityToApi(BookApi api){
      return new BookEntity(
              api.getIdBook(),
              api.getTitle(),
              api.getPrice(),
              api.getDescription(),
              api.getQuantity(),
              api.getBookCategoryEntity(),
              api.getAuthorEntityList(),
              api.getRentalEntityList()
      );
    }

    public BookApi bookAdapterApiToEntity(BookEntity entity){
        return new BookApi(
                entity.getIdBook(),
                entity.getTitle(),
                entity.getPrice(),
                entity.getDescription(),
                entity.getQuantity(),
                entity.getBookCategoryEntity(),
                entity.getAuthorEntityList(),
                entity.getRentalEntityList()
        );
    }


        @Override
    public Iterable<BookApi> getAll() {
            Iterable<BookEntity> bookEntities = service.getAll();
            bookEntities.

            return null;
    }

    @Override
    public Optional<BookApi> getById(int id) {
        return Optional.empty();
    }

    @Override
    public BookApi create(BookApi book) {
        return null;
    }

    @Override
    public Optional<BookApi> update(int id, BookApi entity) {
        return Optional.empty();
    }

    @Override
    public Boolean delete(int id) {
        return null;
    }
}
