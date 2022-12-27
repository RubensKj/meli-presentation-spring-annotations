package com.meli.example.spring.ninjections;

import com.meli.example.spring.ninjections.injections.IInjectionTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MultipleInjectionsComponent {

    private static final Logger LOGGER = LoggerFactory.getLogger(MultipleInjectionsComponent.class);

    private final List<IInjectionTask> tasks;

    @Qualifier("emailTask")
    @Autowired
    private IInjectionTask emailTask;

    public MultipleInjectionsComponent(List<IInjectionTask> tasks) {
        this.tasks = tasks;
    }

    public String executeMultipleTasksViaInjections() {
        tasks.forEach(IInjectionTask::execute);

        LOGGER.info("Finished every task... Return endpoint response");

        return "Executed every task";
    }

    public String executeEmailTask() {
        emailTask.execute();

        return "Executed Email Task";
    }
}
