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

    @Column(name = "quantity")
    private int quantity;


    // -- ENTITY DECLARATION

    @ManyToOne()
    @JoinColumn(name = "fk_book_category",referencedColumnName = "id_book_category")
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

    public BookEntity() {
    }



    // -- GETTERS AND SETTERS

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public BookCategoryEntity getBookCategoryEntity() {
        return bookCategoryEntity;
    }

    public void setBookCategoryEntity(BookCategoryEntity bookCategoryEntity) {
        this.bookCategoryEntity = bookCategoryEntity;
    }

    public List<AuthorEntity> getAuthorEntityList() {
        return authorEntityList;
    }

    public void setAuthorEntityList(List<AuthorEntity> authorEntityList) {
        this.authorEntityList = authorEntityList;
    }

    public List<RentalEntity> getRentalEntityList() {
        return rentalEntityList;
    }

    public void setRentalEntityList(List<RentalEntity> rentalEntityList) {
        this.rentalEntityList = rentalEntityList;
    }
}