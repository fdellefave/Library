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




    // -- ENTITY DECLARATION

    @OneToMany(mappedBy = "userRentalEntity")
    private List<RentalEntity> rentalEntityList;



    // -- CONSTRUCTOR

    public UserEntity(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public UserEntity() {
    }



    // -- GETTERS AND SETTERS

    public int getIdUser() {
        return idUser;
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

    public List<RentalEntity> getRentalEntityList() {
        return rentalEntityList;
    }

    public void setRentalEntityList(List<RentalEntity> rentalEntityList) {
        this.rentalEntityList = rentalEntityList;
    }
}
