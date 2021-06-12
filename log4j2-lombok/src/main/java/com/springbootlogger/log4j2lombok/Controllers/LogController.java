package com.springbootlogger.log4j2lombok.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    String message = "Logging output via Log4j2 with Lombok..";

    @GetMapping("/log")
    public String log() {
        return message;
    }
}
