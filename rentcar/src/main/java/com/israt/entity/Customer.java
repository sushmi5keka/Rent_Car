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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogInName() {
        return logInName;
    }

    public void setLogInName(String logInName) {
        this.logInName = logInName;
    }

    public Date getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(Date registerDate) {
        RegisterDate = registerDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
