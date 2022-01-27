package it.fdellefave.library.api;

import it.fdellefave.library.model.AuthorEntity;
import it.fdellefave.library.model.BookCategoryEntity;
import it.fdellefave.library.model.RentalEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class BookApi {

    // -- FIELD DECLARATION

    private int idBook;

    private String title;

    private Double price;

    private String description;

    private int quantity;


    // -- ENTITY DECLARATION

    private BookCategoryEntity bookCategoryEntity;

    private List<AuthorEntity> authorEntityList;

    private List<RentalEntity> rentalEntityList;

    // -- CONSTRUCTOR


    public BookApi(int idBook, String title, Double price, String description, int quantity,
                   BookCategoryEntity bookCategoryEntity, List<AuthorEntity> authorEntityList,
                   List<RentalEntity> rentalEntityList) {
        this.idBook = idBook;
        this.title = title;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.bookCategoryEntity = bookCategoryEntity;
        this.authorEntityList = authorEntityList;
        this.rentalEntityList = rentalEntityList;
    }
}
