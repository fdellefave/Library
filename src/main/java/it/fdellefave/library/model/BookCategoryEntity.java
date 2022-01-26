package it.fdellefave.library.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tpl_book_category")
public class BookCategoryEntity {

    // -- FIELD DECLARATION

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book_category")
    private int idBookCategory;

    @Column(name = "category")
    private String category;



    // -- ENTITY DECLARATION

    @OneToMany(mappedBy = "bookCategoryEntity")
    private List<BookEntity> bookEntityList;



    // -- CONSTRUCTOR

    public BookCategoryEntity(String category) {
        this.category = category;
    }

    public BookCategoryEntity() {
    }



    // -- GETTERS AND SETTERS

    public int getIdBookCategory() {
        return idBookCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<BookEntity> getBookEntityList() {
        return bookEntityList;
    }

    public void setBookEntityList(List<BookEntity> bookEntityList) {
        this.bookEntityList = bookEntityList;
    }

}
