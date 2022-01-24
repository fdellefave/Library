package it.fdellefave.library.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "author")
public class AuthorEntity {

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

    public AuthorEntity(String name, String surname, Date dateBirth, String localBirth) {
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
        this.localBirth = localBirth;
    }

    public AuthorEntity() {
    }

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
}
