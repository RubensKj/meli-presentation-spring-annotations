package com.meli.example.spring.greetings.service;

import com.meli.example.spring.greetings.dto.GreetingsDto;
import org.springframework.stereotype.Service;

@Service
public class HiRestServiceImpl implements IGreetingsRestService {
    @Override
    public GreetingsDto getGreetings(String name) {
        return new GreetingsDto("Hii!!", name);
    }
}
