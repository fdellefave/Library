package it.fdellefave.library.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
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

    @OneToMany(mappedBy = "userRentalEntity")
    private List<RentalEntity> rentalEntityList;


    // -- CONSTRUCTOR

    public UserEntity(String name, String surname, Double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }


    public UserEntity() {
    }


    // -- GETTERS AND SETTERS

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<RentalEntity> getRentalEntityList() {
        return rentalEntityList;
    }

    public void setRentalEntityList(List<RentalEntity> rentalEntityList) {
        this.rentalEntityList = rentalEntityList;
    }
}