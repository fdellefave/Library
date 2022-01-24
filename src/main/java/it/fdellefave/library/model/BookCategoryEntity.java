package it.fdellefave.library.model;

import javax.persistence.*;

@Entity
@Table(name = "tpl_book_category")
public class BookCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book_category")
    private int idBookCategory;

    @Column(name = "category")
    private String category;

    public BookCategoryEntity(String category) {
        this.category = category;
    }

    public BookCategoryEntity() {
    }

    public int getIdBookCategory() {
        return idBookCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
