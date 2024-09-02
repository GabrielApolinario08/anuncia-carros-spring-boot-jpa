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
        return new CarDTO(car.getModel(), car.getMark(), car.getPrice(), car.getDescription(), car.getYear(), car.getTravelledDistance(), car.getColor(), ownerId);
    }

    public Car toCar(CarDTO dto) {
        Owner owner = ownerRepository.findById(dto.ownerId()).get();

        return new Car(null, dto.model(), dto.mark(), dto.price(), dto.description(), dto.year(), dto.travelledDistance(), dto.color(), owner, null, null);
    }
}
