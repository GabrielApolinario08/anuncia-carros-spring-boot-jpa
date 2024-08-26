package com.cars.car_advertisement.domain;

import jakarta.persistence.*;
import lombok.*;

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
}
