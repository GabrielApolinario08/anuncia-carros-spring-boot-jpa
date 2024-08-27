package com.cars.car_advertisement.repository;

import com.cars.car_advertisement.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
