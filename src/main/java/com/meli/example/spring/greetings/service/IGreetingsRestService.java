package com.meli.example.spring.greetings.service;

import com.meli.example.spring.greetings.dto.GreetingsDto;

public interface IGreetingsRestService {

    GreetingsDto getGreetings(String name);
}
