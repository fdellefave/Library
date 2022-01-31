package it.fdellefave.library.api;

import it.fdellefave.library.model.BookCategoryEntity;
import it.fdellefave.library.model.BookNumberEntity;
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

    private int idBookNumber;

    // -- ENTITY DECLARATION

    private BookCategoryEntity bookCategoryEntity;

    private BookNumberEntity bookNumberEntity;

    // -- CONSTRUCTOR

    public BookApi(int idBook, String title, String description, Double price,
                   int quantity, BookCategoryEntity bookCategoryEntity, BookNumberEntity bookNumberEntity) {
        this.idBook = idBook;
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.idCategory = bookCategoryEntity.getIdBookCategory();
        this.idBookNumber = bookNumberEntity.getIdBookNumber();
    }


}
