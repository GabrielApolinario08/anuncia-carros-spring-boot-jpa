package com.cars.car_advertisement.repository;

import com.cars.car_advertisement.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
