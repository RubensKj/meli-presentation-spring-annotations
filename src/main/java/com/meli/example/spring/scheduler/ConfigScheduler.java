package com.meli.example.spring.scheduler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class ConfigScheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigScheduler.class);

    @Scheduled(fixedDelay = 60000)
    public void executeEveryOneMinute() {
        LOGGER.info("Executing routine every 1 minute...");
    }
}
