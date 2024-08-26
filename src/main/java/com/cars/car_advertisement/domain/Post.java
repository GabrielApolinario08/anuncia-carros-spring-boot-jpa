package com.cars.car_advertisement.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime date;
    private String title;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner author;
    @OneToOne
    @JoinColumn(name = "car_id", unique = true)
    private Car car;
}
