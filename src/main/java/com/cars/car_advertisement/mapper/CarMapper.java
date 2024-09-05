package com.cars.car_advertisement.mapper;

import com.cars.car_advertisement.domain.Car;
import com.cars.car_advertisement.dto.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class CarMapper {
    public static final CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    public abstract Car toCar(CarDTO dto);
    public abstract CarDTO toCarDto(Car car);
}
