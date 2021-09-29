package com.springbootlogger.logback.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Logback - Spring Boot logger";

    @GetMapping("/")
    public String home() {
        return message;
    }
}
