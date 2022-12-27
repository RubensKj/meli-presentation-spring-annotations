package com.meli.example.spring.greetings;

import com.meli.example.spring.greetings.dto.GreetingsDto;
import com.meli.example.spring.greetings.service.IGreetingsRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest")
public class SimpleGreetingsRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleGreetingsRestController.class);

    private final IGreetingsRestService restService;

    public SimpleGreetingsRestController(
//            @Qualifier("helloRestServiceImpl")
            IGreetingsRestService restService
    ) {
        this.restService = restService;
    }

    @GetMapping("/hello/{name}/{pathText}")
    public GreetingsDto getHello(@PathVariable String name, @PathVariable("pathText") String pathName) {
        LOGGER.info("Path param: {}", pathName);
        return restService.getGreetings(name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public GreetingsDto getHelloThroughQueryParam(@RequestParam("name") String name, @RequestParam String queryNameParam) {
        LOGGER.info("Query param via property name: {}", queryNameParam);
        return restService.getGreetings(name);
    }
}
