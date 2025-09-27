package com.lab4.assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Profiles {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToOne(mappedBy = "profiles")
    private long id;

    private String bio;

    private String phone_number;

    private String date_of_birth;

    private int loyality_points;

}
