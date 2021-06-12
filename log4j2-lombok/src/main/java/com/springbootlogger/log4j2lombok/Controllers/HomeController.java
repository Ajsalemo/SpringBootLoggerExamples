package com.springbootlogger.log4j2lombok.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Log4j2lombok - Spring Boot logger";

    @GetMapping("/")
    public String home() {
        return message;
    }
}
