package com.meli.example.spring.greetings.dto;

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

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
