package com.cars.car_advertisement.service;

import com.cars.car_advertisement.domain.Post;
import com.cars.car_advertisement.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public List<Post> findAll() {
        return repository.findAll();
    }
}
