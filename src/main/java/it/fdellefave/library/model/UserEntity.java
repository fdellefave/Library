package it.fdellefave.library.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

    // -- FIELD DECLARATION

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "balance")
    private Double balance;


    // -- ENTITY DECLARATION

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userRentalEntity")
    private List<RentalEntity> rentalEntityList;


    // -- CONSTRUCTOR

    public UserEntity(String name, String surname, Double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }



    // -- GETTERS AND SETTERS

   // @JsonManagedReference
    public List<RentalEntity> getRentalEntityList() {
        return rentalEntityList;
    }

}