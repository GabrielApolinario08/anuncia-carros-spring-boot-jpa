package com.cars.car_advertisement.config;

import com.cars.car_advertisement.domain.Car;
import com.cars.car_advertisement.domain.Image;
import com.cars.car_advertisement.domain.Owner;
import com.cars.car_advertisement.domain.Post;
import com.cars.car_advertisement.repository.CarRepository;
import com.cars.car_advertisement.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private OwnerRepository ownerRepository;


    @Override
    public void run(String... args) throws Exception {
        ownerRepository.deleteAll();
        Car car1 = Car.builder().model("Civic").mark("Honda").price(200000.0).description("Carro maravilhoso").year(2020).travelledDistance(20000).color("Preto").build();
        Owner owner = Owner.builder().name("Gabriel").telephoneNumber("12996396921").email("gabriel@gmail.com").localization("Guaratinguetá, Brasil").build();
        Post post1 = new Post(null, LocalDateTime.now(), "Honda Civic preto automático", owner, car1);
        owner.getCars().add(car1);
        owner.getPosts().add(post1);
        ownerRepository.save(owner);
        car1.setOwner(owner);
        car1.setPost(post1);
        car1.getImages().add(new Image(null, "https://www.webmotors.com.br/wp-content/uploads/2019/08/07154711/WhatsApp-Image-2019-08-07-at-15.45.15.jpeg", car1));
        car1.getImages().add(new Image(null, "https://www.webmotors.com.br/wp-content/uploads/2019/08/07154907/WhatsApp-Image-2019-08-07-at-15.47.23.jpeg", car1));
        carRepository.save(car1);
    }
}
