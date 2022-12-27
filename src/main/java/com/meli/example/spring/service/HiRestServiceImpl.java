package com.meli.example.spring.service;

import com.meli.example.spring.dto.GreetingsDto;
import org.springframework.stereotype.Service;

@Service
public class HiRestServiceImpl implements IGreetingsRestService {
    @Override
    public GreetingsDto getGreetings(String name) {
        return new GreetingsDto("Hii!!", name);
    }
}
