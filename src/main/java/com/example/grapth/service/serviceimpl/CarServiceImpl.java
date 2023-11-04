package com.example.grapth.service.serviceimpl;

import com.example.grapth.dto.request.CarRequest;
import com.example.grapth.dto.response.CarResponse;
import com.example.grapth.dto.response.SimpleResponse;
import com.example.grapth.entities.Car;
import com.example.grapth.repositories.CarRepository;
import com.example.grapth.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public CarResponse getById(Long id) {
        return carRepository.getCarById(id);
    }

    @Override
    public SimpleResponse save(CarRequest carRequest) {
        Car car = new Car();
        car.setColor(carRequest.color());
        car.setName(carRequest.name());
        car.setPrice(carRequest.price());
        car.setModel(carRequest.model());
        car.setEmail(carRequest.email());
        carRepository.save(car);
        return new SimpleResponse("Car successfully saved!");
    }

    @Override
    public SimpleResponse updateCar(Long id, CarRequest carRequest) {
        Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found!"));
        if (carRequest.color() != null) car.setColor(carRequest.color());
        if (carRequest.name() != null) car.setName(carRequest.name());
        if (carRequest.price() != 0) car.setPrice(carRequest.price());
        if (carRequest.model() != null) car.setModel(carRequest.model());
        if (carRequest.email() != null) car.setEmail(carRequest.email());
        carRepository.save(car);
        return new SimpleResponse("Car successfully updated!");
    }

    @Override
    public SimpleResponse deleteCarById(Long id) {
        carRepository.deleteById(id);
        return new SimpleResponse("Car with id " + id + " successfully deleted!");
    }

    @Override
    public List<CarResponse> getAll() {
        return carRepository.getAllCars();
    }

}
