package com.cars.car_advertisement.service;

import com.cars.car_advertisement.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarRepository repository;

}
