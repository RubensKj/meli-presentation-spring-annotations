package com.meli.example.spring.serversidecontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/old")
public class ServerSideController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerSideController.class);

    @GetMapping("/")
    public String home() {
        LOGGER.info("Pushing user to home...");
        return "home";
    }

    @GetMapping("/profile")
    public String profile(@RequestParam(name="name", required=false, defaultValue="Unknown") String name, Model model) throws InterruptedException {
        LOGGER.info("Pushing user to profile page... Name: {}", name);
        model.addAttribute("name", name);
        // Just to show how this is a server side rendering
        Thread.sleep(6000L);
        return "profile";
    }
}
