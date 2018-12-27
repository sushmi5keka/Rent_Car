package com.israt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "searchResult")
public class SearchResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "date" )
    private Date date;

    @Column(name = "time" )
    private String time;
}
