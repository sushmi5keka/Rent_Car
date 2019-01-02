package com.israt.entity;

import javax.persistence.*;

@Entity
@Table(name = "branchAddress")
public class BranchAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "street_name",nullable = false)
    private String streetName;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "street_number",nullable = false)
    private String streetNumber;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "phone_number",nullable = false)
    private String phoneNumber;



}
