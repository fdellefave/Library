package it.fdellefave.library.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "author")
@Getter
@Setter
@NoArgsConstructor
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

    @ManyToOne
    @JoinColumn(name = "fk_book", referencedColumnName = "id_book")
    private BookEntity bookAuthorEntity;



    // -- CONSTRUCTOR

    public AuthorEntity(String name, String surname, Date dateBirth, String localBirth, BookEntity bookAuthor) {
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
        this.localBirth = localBirth;
        this.bookAuthorEntity = bookAuthor;
    }

    // -- GETTERs & SETTERs

   // @JsonBackReference
    public BookEntity getBookAuthorEntity() {
        return bookAuthorEntity;
    }

}
