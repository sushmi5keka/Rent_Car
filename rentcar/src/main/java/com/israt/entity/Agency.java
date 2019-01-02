package com.israt.entity;

import javax.persistence.*;

@Entity
@Table(name = "agency")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "name",unique = true)
    private  String name;



}
