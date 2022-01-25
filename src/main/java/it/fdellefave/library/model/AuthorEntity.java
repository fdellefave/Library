package it.fdellefave.library.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "author")
public class AuthorEntity {

    // -- FIELD DECLARATION

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_author")
    private int idAuthor;

    @Column(name = "")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "date_birth")
    private Date dateBirth;

    @Column(name = "local_birth")
    private String localBirth;



    // -- ENTITY DECLARATION

    /**
     * Many to One, perchè ci sono più Autori(many) per un libro(one) e indichiamo la joincolumn, ovvero la colonna
     * che effettua la join con l'altra ovvero, indico l'fk di book.
     */
    @ManyToOne
    @JoinColumn(name = "fk_book")
    private BookEntity bookAuthorEntity;



    // -- CONSTRUCTOR

    public AuthorEntity(String name, String surname, Date dateBirth, String localBirth) {
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
        this.localBirth = localBirth;
    }

    public AuthorEntity() {
    }



    // -- GETTERS AND SETTERS

    public int getIdAuthor() {
        return idAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getLocalBirth() {
        return localBirth;
    }

    public void setLocalBirth(String localBirth) {
        this.localBirth = localBirth;
    }

    public BookEntity getBookAuthorEntity() {
        return bookAuthorEntity;
    }

    public void setBookAuthorEntity(BookEntity bookEntity) {
        this.bookAuthorEntity = bookEntity;
    }
}
