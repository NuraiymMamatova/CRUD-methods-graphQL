package com.example.grapth.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "cars")
public class Car {

    @Id
    @SequenceGenerator(name = "car_seq_name", sequenceName = "seq_name", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_seq_name")
    private Long id;

    private String name;

    private String email;

    private String model;

    private String color;

    private int price;

}
