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

public record CarDTO (String model,  String mark, Double price, String description, Integer year, Integer travelledDistance,  String color, Long ownerId) {

}
