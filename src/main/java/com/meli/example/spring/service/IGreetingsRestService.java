package com.meli.example.spring.service;

import com.meli.example.spring.dto.GreetingsDto;

public interface IGreetingsRestService {

    GreetingsDto getGreetings(String name);
}
