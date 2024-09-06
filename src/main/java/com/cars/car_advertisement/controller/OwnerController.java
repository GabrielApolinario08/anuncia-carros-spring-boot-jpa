package com.cars.car_advertisement.controller;

import com.cars.car_advertisement.domain.Owner;
import com.cars.car_advertisement.dto.OwnerDTO;
import com.cars.car_advertisement.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/{id}")
    public ResponseEntity<Owner> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody OwnerDTO dto) {
        service.insert(dto);
        return ResponseEntity.ok().build();
    }
 }
