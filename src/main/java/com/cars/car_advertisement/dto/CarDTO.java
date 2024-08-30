package com.cars.car_advertisement.dto;

import com.cars.car_advertisement.domain.Car;
import com.cars.car_advertisement.domain.Image;
import com.cars.car_advertisement.domain.Owner;
import com.cars.car_advertisement.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarDTO {
    Long id;
    String model;
    String mark;
    Double price;
    String description;
    Integer year;
    Integer travelledDistance;
    String color;
    Owner owner;
    List<Image> images;
    public CarDTO(Car car) {
        id = car.getId();
        model = car.getModel();
        mark = car.getMark();
        price = car.getPrice();
        description = car.getDescription();
        year = car.getYear();
        travelledDistance = car.getTravelledDistance();
        color = car.getColor();
        owner = car.getOwner();
        images = car.getImages();
    }
}
