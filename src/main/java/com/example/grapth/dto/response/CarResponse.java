package com.example.grapth.dto.response;

public record CarResponse(

        Long id,

        String name,

        String email,

        String model,

        String color,

        int price) {
}