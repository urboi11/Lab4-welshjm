package com.lab4.assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
