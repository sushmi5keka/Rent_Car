package com.israt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @ManyToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Cars cars;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "booking_date" )
    private Date bookingDate;

    @Column(name = "return_date" )
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    @Column(name = "time_stamp")
    private String timeStamp;


}
