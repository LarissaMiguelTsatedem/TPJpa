package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Person {

    public String nom;
    public int id ;
    public Person() {
        super();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
     @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

