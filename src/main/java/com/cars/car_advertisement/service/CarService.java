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

    public List<Car> findAll() {
        return repository.findAll();
    }
    public Car findById(Long id) {
        return repository.findById(id).get();
    }

    public void insert(CarDTO dto) {
        Car car = new CarMapper(ownerRepository).toCar(dto);
        repository.save(car);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Car uptade(Car car) {
        Car obj = findById(car.getId());
        updateData(car, obj);
        repository.save(obj);
        return obj;
    }

    public void updateData(Car car, Car obj) {
        obj.setModel(car.getModel());
        obj.setMark(car.getMark());
        obj.setPrice(car.getPrice());
        obj.setDescription(car.getDescription());
        obj.setYear(car.getYear());
        obj.setTravelledDistance(car.getTravelledDistance());
        obj.setColor(car.getColor());
    }
}
