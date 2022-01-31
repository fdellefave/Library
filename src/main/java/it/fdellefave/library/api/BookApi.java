package it.fdellefave.library.api;

import it.fdellefave.library.model.BookCategoryEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class BookApi {


    private int idBook;

    private String title;

    private Double price;

    private String description;

    private int quantity;

    private int idCategory;


    // -- ENTITY DECLARATION

    private BookCategoryEntity bookCategoryEntity;
//
//    private List<AuthorEntity> authorEntityList;
//
//    private List<RentalEntity> rentalEntityList;

    // -- CONSTRUCTOR

    public BookApi(int idBook, String title, String description, Double price, int quantity, BookCategoryEntity bookCategoryEntity) {
        this.idBook = idBook;
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.idCategory = bookCategoryEntity.getIdBookCategory();
    }


}
