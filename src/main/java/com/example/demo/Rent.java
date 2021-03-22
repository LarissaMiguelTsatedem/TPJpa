package com.example.demo;

import javax.persistence.ManyToOne;

public class Rent {

    private Car car;



    public Rent() {
        super();
    }

    @ManyToOne
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
}
