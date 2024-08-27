package com.cars.car_advertisement.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owner")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String telephoneNumber;
    private String email;
    private String localization;
    @JsonIgnore
    @OneToMany(mappedBy = "owner")
    private List<Car> cars = new ArrayList<>();
    @OneToMany(mappedBy = "author")
    private List<Post> posts = new ArrayList<>();
}
