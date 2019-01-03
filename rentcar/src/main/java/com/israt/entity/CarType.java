package com.israt.entity;

import javax.persistence.*;

@Entity
@Table(name = "car_type")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }
}
