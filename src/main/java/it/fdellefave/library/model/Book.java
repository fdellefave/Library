package it.fdellefave.library.model;


import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private int idBook;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @Column(name = "fk_category")
    private int fkCategory;


    public Book(String title, String author, Double price, String description, int fkCategory) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.description = description;
        this.fkCategory = fkCategory;
    }

    public Book() {
    }

    public int getFkCategory() {
        return fkCategory;
    }

    public void setFkCategory(int fkCategory) {
        this.fkCategory = fkCategory;
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", description=" + description +
                ", fkCategory=" + fkCategory +
                '}';
    }
}
