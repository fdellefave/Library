package it.fdellefave.library.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "book_number")
@Getter
@Setter
@NoArgsConstructor
public class BookNumberEntity {

    // -- FIELD DECLARATION

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book_number")
    private int idBookNumber;

    @Column(name = "creation_date")
    @UpdateTimestamp
    private LocalDateTime creationDate;

    @Column(name = "last_update_date")
    @CreationTimestamp
    private LocalDateTime lastUpdateDate;

    @Column(name = "isbn_code")
    private String isbnCode;


    // RELATIONAL

    @OneToOne
    @JoinColumn(name = "fk_book",referencedColumnName = "id_book")
    private BookEntity bookEntity;

    // CONSTRUCTOR

    public BookNumberEntity(String isbnCode, BookEntity bookEntity) {
        this.isbnCode = isbnCode;
        this.bookEntity = bookEntity;
    }


}