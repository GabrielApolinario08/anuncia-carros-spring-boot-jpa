package com.cars.car_advertisement.mapper;

import com.cars.car_advertisement.domain.Owner;
import com.cars.car_advertisement.dto.OwnerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class OwnerMapper {
    public static final OwnerMapper INSTANCE = Mappers.getMapper(OwnerMapper.class);

    public abstract Owner toOwner(OwnerDTO dto);
    public abstract OwnerDTO toOwnerDTO(Owner owner);

}
