package com.meli.example.spring.dto;

public class GreetingsDto {

    private String message;
    private String name;

    public GreetingsDto(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
