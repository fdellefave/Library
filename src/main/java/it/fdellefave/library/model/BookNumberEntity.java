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


    //@TODO MappedBy
    /**
     * Inserendo mappedBy indichiamo che questa tabella concederà di essere la subordinata del nome del campo instanziato nell'altra
     * tabella. In questo caso diremo che l'owner è BookEntity e la subordinata è BookNumberEntity. In questo modo le referenze della
     * tabella saranno in carico a BookEntity. Quindi nella tabella book si creerà una colonna che si chiama fk_book_number che conterrà
     * i valori di bookNumberEntity o book_number. Se togliamo l'annotazione di mappedBy, jpa provvederà a creare un fk su entrambe le tabelle.
     */

    @OneToOne(mappedBy = "bookNumberEntity")
    private BookEntity bookEntity;

    // CONSTRUCTOR

    public BookNumberEntity(String isbnCode) {
        this.isbnCode = isbnCode;
    }


}