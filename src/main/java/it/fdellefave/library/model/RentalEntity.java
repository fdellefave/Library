package it.fdellefave.library.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rental_book_user")
@Getter
@Setter
@NoArgsConstructor
public class RentalEntity {

    // -- FIELD DECLARATION

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rental_book_user")
    private int idRental;

    @Column(name = "rental_date")
    private Date rentalDate;



    // -- ENTITY DECLARATION

    @ManyToOne
    @JoinColumn(name = "fk_user", referencedColumnName = "id_user")
    private UserEntity userRentalEntity;

    @ManyToOne
    @JoinColumn(name = "fk_book", referencedColumnName = "id_book")
    private BookEntity bookRentalEntity;



    // -- CONSTRUCTOR


    public RentalEntity(Date rentalDate, UserEntity userRentalEntity, BookEntity bookRentalEntity) {
        this.rentalDate = rentalDate;
        this.userRentalEntity = userRentalEntity;
        this.bookRentalEntity = bookRentalEntity;
    }



    // -- GETTERS AND SETTERS

    //@JsonBackReference
    public UserEntity getUserRentalEntity() {
        return userRentalEntity;
    }

    //@JsonBackReference
    public BookEntity getBookRentalEntity() {
        return bookRentalEntity;
    }


}
