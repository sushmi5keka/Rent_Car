package com.israt.entity;

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agency_id")
    private  Agency agency;

    @Column(name = "name",unique = true)
    private  String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
