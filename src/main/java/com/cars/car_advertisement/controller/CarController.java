package com.cars.car_advertisement.controller;

import com.cars.car_advertisement.domain.Car;
import com.cars.car_advertisement.dto.CarDTO;
import com.cars.car_advertisement.mapper.CarMapper;
import com.cars.car_advertisement.repository.OwnerRepository;
import com.cars.car_advertisement.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cars")
public class CarController {
    @Autowired
    private CarService service;

    @Autowired
    private OwnerRepository ownerRepository;

    @GetMapping
    public ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Car> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody CarDTO car) {
        service.insert(car);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Car> update(@PathVariable Long id, @RequestBody CarDTO dto) {
        Car car = new CarMapper(ownerRepository).toCar(dto);
        car.setId(id);
        return ResponseEntity.ok().body(service.uptade(car));

    }
}
