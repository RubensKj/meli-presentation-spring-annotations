package com.meli.example.spring.ninjections;

import com.meli.example.spring.ninjections.injections.IInjectionTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MultipleInjectionsComponent {

    private static final Logger LOGGER = LoggerFactory.getLogger(MultipleInjectionsComponent.class);

    private final List<IInjectionTask> tasks;

    public MultipleInjectionsComponent(List<IInjectionTask> tasks) {
        this.tasks = tasks;
    }

    public String validateMultipleInjections() {
        tasks.forEach(IInjectionTask::execute);

        LOGGER.info("Finished every task... Return endpoint response");

        return "Executed every task";
    }
}
