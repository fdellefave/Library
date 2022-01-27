package it.fdellefave.library.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
@NoArgsConstructor
public class BookEntity {

    // -- FIELD DECLARATION

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private int idBook;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private int quantity;


    // -- ENTITY DECLARATION

    @ManyToOne()
    @JoinColumn(name = "fk_book_category", referencedColumnName = "id_book_category")
    private BookCategoryEntity bookCategoryEntity;

    @OneToMany(mappedBy = "bookAuthorEntity")
    private List<AuthorEntity> authorEntityList;

    @OneToMany(mappedBy = "bookRentalEntity")
    private List<RentalEntity> rentalEntityList;


    // -- CONSTRUCTOR

    public BookEntity(String title, String description, Double price, int quantity, BookCategoryEntity bookCategory) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.bookCategoryEntity = bookCategory;
    }

    public BookEntity(int idBook, String title, Double price, String description, int quantity,
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