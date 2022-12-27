package com.meli.example.spring.ninjections.injections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GenerateNfTask implements IInjectionTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(GenerateNfTask.class);

    @Override
    public void execute() {
        LOGGER.info("Generating NF...");
    }
}
