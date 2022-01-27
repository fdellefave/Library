package it.fdellefave.library.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @ManyToOne
    @JoinColumn(name = "fk_book_category", referencedColumnName = "id_book_category")
    private BookCategoryEntity bookCategoryEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "bookAuthorEntity")
    private List<AuthorEntity> authorEntityList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bookRentalEntity")
    private List<RentalEntity> rentalEntityList;


    // -- CONSTRUCTOR

    public BookEntity(String title, String description, Double price, int quantity, BookCategoryEntity bookCategory) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.bookCategoryEntity = bookCategory;
    }


    // -- GETTERs & SETTERs

    @JsonManagedReference
    public List<AuthorEntity> getAuthorEntityList() {
        return authorEntityList;
    }
    @JsonManagedReference
    public List<RentalEntity> getRentalEntityList() {
        return rentalEntityList;
    }

    @JsonBackReference
    public BookCategoryEntity getBookCategoryEntity() {
        return bookCategoryEntity;
    }
}