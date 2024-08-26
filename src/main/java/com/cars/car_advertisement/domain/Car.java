package com.cars.car_advertisement.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String mark;
    private Double price;
    private String description;
    private Integer year;
    private Integer travelledDistance;
    private String color;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
