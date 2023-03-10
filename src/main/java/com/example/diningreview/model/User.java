package com.example.diningreview.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userName;
    private String city;
    private String state;
    private int zipcode;

    private boolean peanutAllergy;
    private boolean eggAllergy;
    private boolean dairyAllergy;
}
