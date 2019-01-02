package com.israt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

    @Column(name = "customer_id",nullable = false)
    private Customer customer;

    @Column(name = "agency_id")
    private Agency agency;

    @Column(name = "car_id")
    private Cars cars;

    @Column(name = "booking_date" )
    private Date bookingDate;

    @Column(name = "return_date" )
    private Date returnDate;

    @Column(name = "time_stamp")
    private String timeStamp;
}
