package com.israt.entity;

import javax.persistence.*;

@Entity
@Table(name = "carType")
public class CarType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "name",nullable = false)
    private String Name;

    @Column(name = "producer")
    private String producer;

    @Column(name = "type")
    private String type;

    @Column(name = "automatic")
    private boolean automatic;

}
