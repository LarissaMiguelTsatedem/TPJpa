package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
    private String plateNumber;
    private String marque;
     @Id
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        plateNumber = plateNumber;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        marque = marque;
    }
}
