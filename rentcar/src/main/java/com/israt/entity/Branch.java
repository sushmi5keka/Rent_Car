package com.israt.entity;

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "agency_id",unique = true)
    private  Agency agency;

    @Column(name = "name",unique = true)
    private  String name;



}
