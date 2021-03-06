package com.israt.entity;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "rentDetail")
public class RentDetail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "car_name",nullable = false)
    private String carName;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "start_location")
    private String startLocation;

    @Column(name = "end_location")
    private String endLocation;

    @Column(name = "rent_date")
    private Date rentDate;

    @Column(name = "rent_cost")
    private String rentCost;

}
