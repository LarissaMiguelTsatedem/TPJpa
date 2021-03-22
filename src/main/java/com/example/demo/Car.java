package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Car {
    private String plateNumber;
    private String marque;
    private long key;
    private List<Rent> rents = new ArrayList<Rent>();
    private  Rent rent;

    public Car() {
        super();
    }
    public String getPlateNumber() {

        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {

        this.plateNumber = plateNumber;
    }

    public String getMarque() {

        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getKey() {
        return key;
    }

    public void setKey(long key) {

        this.key = key;
    }

    @OneToMany(mappedBy="car", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    public List<Rent> getRent() {
        return rents;
    }

    public void setRent(List<Rent> rents) {
        this.rents = rents;
    }


}

