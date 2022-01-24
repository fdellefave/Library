package it.fdellefave.library.model;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rental_book_user")
public class RentalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rental")
    private int idRental;

    @Column(name = "rental_date")
    private Date rentalDate;

    @ManyToOne
    @JoinColumn(name = "fk_book")
    private BookEntity fkBook;

    @ManyToOne
    @JoinColumn(name = "fk_user")
    private UserEntity fkUser;

    public RentalEntity() {
    }

    public int getIdRental() {
        return idRental;
    }


    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public BookEntity getFkBook() {
        return fkBook;
    }

    public void setFkBook(BookEntity fkBook) {
        this.fkBook = fkBook;
    }

    public UserEntity getFkUser() {
        return fkUser;
    }

    public void setFkUser(UserEntity fkUser) {
        this.fkUser = fkUser;
    }
}
