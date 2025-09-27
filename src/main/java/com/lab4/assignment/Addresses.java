package com.lab4.assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class Addresses {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String street;

    private String city;

    private String state;

    private String zip;

    @OneToMany(mappedBy = "addresses")
    private long user_id;
    
}
