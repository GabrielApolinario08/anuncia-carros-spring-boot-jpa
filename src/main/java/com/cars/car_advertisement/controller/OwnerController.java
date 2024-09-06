package com.cars.car_advertisement.controller;

import com.cars.car_advertisement.domain.Owner;
import com.cars.car_advertisement.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService service;


    @GetMapping
    public ResponseEntity<List<Owner>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
 }
