package com.cars.car_advertisement.repository;

import com.cars.car_advertisement.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
