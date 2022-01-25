package it.fdellefave.library.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
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



    // -- ENTITY DECLARATION

    @ManyToOne
    @JoinColumn(name = "fk_book_category")
    private BookCategoryEntity bookCategoryEntity;

    @OneToMany(mappedBy = "bookAuthorEntity")
    private List<AuthorEntity> authorEntityList;

    @OneToMany(mappedBy = "bookRentalEntity")
    private List<RentalEntity> rentalEntityList;



    // -- CONSTRUCTOR

    public BookEntity(String title, Double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public BookEntity() {
    }



    // -- GETTERS AND SETTERS

    public int getIdBook() {
        return idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AuthorEntity> getAuthorEntityList() {
        return authorEntityList;
    }

    public void setAuthorEntityList(List<AuthorEntity> authorEntityList) {
        this.authorEntityList = authorEntityList;
    }

    public BookCategoryEntity getBookCategoryEntity() {
        return bookCategoryEntity;
    }

    public void setBookCategoryEntity(BookCategoryEntity bookCategoryEntity) {
        this.bookCategoryEntity = bookCategoryEntity;
    }

    public List<RentalEntity> getRentalEntityList() {
        return rentalEntityList;
    }

    public void setRentalEntityList(List<RentalEntity> rentalEntityList) {
        this.rentalEntityList = rentalEntityList;
    }
}