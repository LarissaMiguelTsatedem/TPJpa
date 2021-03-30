package com.example.demo;

import javax.persistence.*;

@Entity
public class Rent {
    private long id;
    private Car car;



    public Rent() {

        super();
    }
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
