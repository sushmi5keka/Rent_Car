package com.israt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "login_name" )
    private String logInName;

    @Column(name = "reg_date" )
    private Date RegisterDate;

    @Column(name = "email" )
    private String email;

    @Column(name = "customer_type" )
    private String customerType;

    @Column(name = "first_name" )
    private String firstName;

    @Column(name = "last_name" )
    private String lastName;

    @Column(name = "date_of_birth" )
    private Date dateOfBirth;

    @Column(name = "password" )
    private String password;

    @Column(name = "company_name" )
    private String companyName;
}
