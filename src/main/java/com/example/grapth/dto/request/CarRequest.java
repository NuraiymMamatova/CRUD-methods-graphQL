package com.example.grapth.dto.request;

public record CarRequest(

        String name,

        String email,

        String model,

        String color,

        int price) {

    @Override
    public String name() {
        return name;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String model() {
        return model;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public int price() {
        return price;
    }

}