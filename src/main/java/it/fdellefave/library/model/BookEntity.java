package it.fdellefave.library.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
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

    @Column(name = "data_creazione")
    @UpdateTimestamp
    private LocalDateTime dataCreazione;

    @Column(name = "data_ultima_modifica")
    @CreationTimestamp
    private LocalDateTime dataUltimaModifica;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private int quantity;


    // -- ENTITY DECLARATION



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_book_category", referencedColumnName = "id_book_category")
    private BookCategoryEntity bookCategoryEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "bookAuthorEntity")
    private List<AuthorEntity> authorEntityList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bookRentalEntity")
    private List<RentalEntity> rentalEntityList;



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_book_number", referencedColumnName = "id_book_number")
    private BookNumberEntity bookNumberEntity;


    // -- CONSTRUCTOR

    public BookEntity(String title, String description, Double price, int quantity, BookCategoryEntity bookCategory, BookNumberEntity bookNumberEntity) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.bookCategoryEntity = bookCategory;
        this.bookNumberEntity = bookNumberEntity;
    }


//    // -- GETTERs & SETTERs
//
//    public List<AuthorEntity> getAuthorEntityList() {
//        return authorEntityList;
//    }
//    public List<RentalEntity> getRentalEntityList() {
//        return rentalEntityList;
//    }
//    public BookCategoryEntity getBookCategoryEntity() {
//        return bookCategoryEntity;
//    }
}