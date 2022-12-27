package com.meli.example.spring.greetings.service;

import com.meli.example.spring.greetings.dto.GreetingsDto;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class HelloRestServiceImpl implements IGreetingsRestService {

    @Override
    public GreetingsDto getGreetings(String name) {
        return new GreetingsDto("Hello", name);
    }
}
