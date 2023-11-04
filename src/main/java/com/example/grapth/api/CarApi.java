package com.example.grapth.api;

import com.example.grapth.dto.request.CarRequest;
import com.example.grapth.dto.response.CarResponse;
import com.example.grapth.dto.response.SimpleResponse;
import com.example.grapth.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/cars")
public class CarApi {

    private final CarService carService;

    @MutationMapping
    public SimpleResponse save(@Argument CarRequest carRequest) {
        return carService.save(carRequest);
    }

    @QueryMapping
    public CarResponse getById(@Argument Long id) {
        return carService.getById(id);
    }

    @MutationMapping
    public SimpleResponse update(@Argument Long id, @Argument CarRequest carRequest) {
        return carService.updateCar(id, carRequest);
    }

    @MutationMapping
    public SimpleResponse deleteById(@Argument Long id) {
        return carService.deleteCarById(id);
    }

    @QueryMapping
    public List<CarResponse> getAll() {
        return carService.getAll();
    }

}
