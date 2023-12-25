package com.example.qualco.model;

import javax.persistence.*;

@Entity
@Table(name = "guests")
public class Guest {

    @Id
    @Column(name = "guest_id")
    private int guestId;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

}