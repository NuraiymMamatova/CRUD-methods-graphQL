package com.example.grapth.service;

import com.example.grapth.dto.request.CarRequest;
import com.example.grapth.dto.response.CarResponse;
import com.example.grapth.dto.response.SimpleResponse;

import java.util.List;

public interface CarService {


    CarResponse getById(Long id);

    SimpleResponse save(CarRequest carRequest);

    SimpleResponse updateCar(Long id, CarRequest carRequest);

    SimpleResponse deleteCarById(Long id);

    List<CarResponse> getAll();

}
