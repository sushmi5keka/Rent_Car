package com.israt.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;


    @ManyToOne
    @JoinColumn(name = "car_type_id")
    private CarType carType;


    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch brunch;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "color")
    private String color;

    @Column(name = "date_of_manufacture")
    private Date ldateOfManufacture;

    @Column(name = "base_price_per_day")
    private String basePricePerDay;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Branch getBrunch() {
        return brunch;
    }

    public void setBrunch(Branch brunch) {
        this.brunch = brunch;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getLdateOfManufacture() {
        return ldateOfManufacture;
    }

    public void setLdateOfManufacture(Date ldateOfManufacture) {
        this.ldateOfManufacture = ldateOfManufacture;
    }

    public String getBasePricePerDay() {
        return basePricePerDay;
    }

    public void setBasePricePerDay(String basePricePerDay) {
        this.basePricePerDay = basePricePerDay;
    }
}
