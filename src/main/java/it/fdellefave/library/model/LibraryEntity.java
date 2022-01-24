package it.fdellefave.library.model;

import javax.persistence.*;

@Entity
@Table(name = "library")
public class LibraryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_library")
    private int idLibrary;

    @ManyToOne
    @JoinColumn(name = "fk_book")
    private BookEntity book;


    public int getIdLibrary() {
        return idLibrary;
    }


    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }
}
