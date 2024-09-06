package com.cars.car_advertisement.service;

import com.cars.car_advertisement.domain.Owner;
import com.cars.car_advertisement.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
    @Autowired
    private OwnerRepository repository;

    public List<Owner> findAll() {
        return repository.findAll();
    }
}
