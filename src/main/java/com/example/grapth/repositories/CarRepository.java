package com.example.grapth.repositories;

import com.example.grapth.dto.response.CarResponse;
import com.example.grapth.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("select new com.example.grapth.dto.response.CarResponse(c.id, c.name, c.email, c.model, c.color, c.price) from Car c where c.id = :id")
    CarResponse getCarById(Long id);

    @Query("select new com.example.grapth.dto.response.CarResponse(c.id, c.name, c.email, c.model, c.color, c.price) from Car c")
    List<CarResponse> getAllCars();

}