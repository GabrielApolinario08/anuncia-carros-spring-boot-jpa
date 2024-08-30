package com.cars.car_advertisement.mapper;

import com.cars.car_advertisement.domain.Car;
import com.cars.car_advertisement.domain.Image;
import com.cars.car_advertisement.domain.Owner;
import com.cars.car_advertisement.dto.CarDTO;
import com.cars.car_advertisement.repository.CarRepository;
import com.cars.car_advertisement.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final OwnerRepository ownerRepository;

    @Autowired
    public CarMapper(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }
    public CarDTO toCarDTO(Car car) {
        Long ownerId = car.getOwner().getId();
        return new CarDTO(car.getId(), car.getModel(), car.getMark(), car.getPrice(), car.getDescription(), car.getYear(), car.getTravelledDistance(), car.getColor(), ownerId, car.getImages());
    }

    public Car toCar(CarDTO dto) {
        Owner owner = ownerRepository.findById(dto.getOwnerId()).get();

        Car car = new Car(null, dto.getModel(), dto.getMark(), dto.getPrice(), dto.getDescription(), dto.getYear(), dto.getTravelledDistance(), dto.getColor(), owner, null, dto.getImages());
        car.getImages().get(0).setCar(car);
        car.getImages().forEach(i -> i.setCar(car));
        return car;
    }
}
