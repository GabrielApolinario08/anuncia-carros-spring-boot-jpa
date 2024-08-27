package com.cars.car_advertisement.controller;

import com.cars.car_advertisement.domain.Car;
import com.cars.car_advertisement.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/car")
public class CarController {
    @Autowired
    private CarService service;

    @GetMapping
    public ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
