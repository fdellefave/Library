package it.fdellefave.library.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tpl_book_category")
@Getter
@Setter
@NoArgsConstructor
public class BookCategoryEntity {

    // -- FIELD DECLARATION

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book_category")
    private int idBookCategory;

    @Column(name = "category")
    private String category;



    // -- ENTITY DECLARATION

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bookCategoryEntity")
    private List<BookEntity> bookEntityList;



    // -- CONSTRUCTOR

    public BookCategoryEntity(String category) {
        this.category = category;
    }

    // -- GETTERS AND SETTERS

    @JsonManagedReference
    public List<BookEntity> getBookEntityList() {
        return bookEntityList;
    }
}
