package it.fdellefave.library.api;

import it.fdellefave.library.model.AuthorEntity;
import it.fdellefave.library.model.BookCategoryEntity;
import it.fdellefave.library.model.RentalEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

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


    // -- ENTITY DECLARATION

    private BookCategoryEntity bookCategoryEntity;

    private List<AuthorEntity> authorEntityList;

    private List<RentalEntity> rentalEntityList;

    // -- CONSTRUCTOR

    public BookApi(String title, String description, Double price, int quantity) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }


}
