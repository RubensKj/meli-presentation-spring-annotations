package com.meli.example.spring.ninjections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multiple")
public class MultipleInjectionsController {

    private final MultipleInjectionsComponent multipleInjectionsComponent;

    public MultipleInjectionsController(MultipleInjectionsComponent multipleInjectionsComponent) {
        this.multipleInjectionsComponent = multipleInjectionsComponent;
    }

    @GetMapping("/execute")
    public String executeMultipleTasks() {
        return multipleInjectionsComponent.executeMultipleTasksViaInjections();
    }

    @GetMapping("/email-task")
    public String executeEmailTask() {
        return multipleInjectionsComponent.executeEmailTask();
    }
}
