package com.cars.car_advertisement.service;

import com.cars.car_advertisement.domain.Car;
import com.cars.car_advertisement.dto.CarDTO;
import com.cars.car_advertisement.mapper.CarMapper;
import com.cars.car_advertisement.repository.CarRepository;
import com.cars.car_advertisement.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository repository;

    @Autowired
    private OwnerRepository ownerRepository;

    public List<CarDTO> findAll() {
        return repository.findAll().stream().map(new CarMapper(ownerRepository)::toCarDTO).toList();
    }
    public CarDTO findById(Long id) {
        return new CarMapper(ownerRepository).toCarDTO(repository.findById(id).get());
    }

    public void insert(CarDTO dto) {
        Car car = new CarMapper(ownerRepository).toCar(dto);
        repository.save(car);
    }
}
