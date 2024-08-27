package com.cars.car_advertisement.service;

import com.cars.car_advertisement.domain.Car;
import com.cars.car_advertisement.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository repository;

    public List<Car> findAll() {
        return repository.findAll();
    }
}
