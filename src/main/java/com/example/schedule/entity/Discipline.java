package com.example.schedule.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "disciplines")
public class Discipline {

    public Discipline() {
    }

    public Discipline(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
