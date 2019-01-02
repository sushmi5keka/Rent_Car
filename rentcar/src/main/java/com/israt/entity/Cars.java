package com.israt.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "car_type_id")
    private CarType carType;

    @Column(name = "brunch_id")
    private Branch brunch;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "color")
    private String color;

    @Column(name = "date_of_manufacture")
    private Date ldateOfManufacture;

    @Column(name = "base_price_per_day")
    private String basePricePerDay;




}
