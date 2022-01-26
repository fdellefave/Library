package it.fdellefave.library.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rental_book_user")
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

    public RentalEntity() {
    }



    // -- GETTERS AND SETTERS


    public int getIdRental() {
        return idRental;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public UserEntity getUserRentalEntity() {
        return userRentalEntity;
    }

    public void setUserRentalEntity(UserEntity userRentalEntity) {
        this.userRentalEntity = userRentalEntity;
    }

    public BookEntity getBookRentalEntity() {
        return bookRentalEntity;
    }

    public void setBookRentalEntity(BookEntity bookRentalEntity) {
        this.bookRentalEntity = bookRentalEntity;
    }
}
