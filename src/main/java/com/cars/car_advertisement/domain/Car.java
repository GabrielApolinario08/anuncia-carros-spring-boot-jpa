package com.cars.car_advertisement.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

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
    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private Post post;
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Image> images = new ArrayList<>();
}
