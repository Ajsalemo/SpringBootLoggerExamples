package com.springbootlogger.log4j2.Controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Log4j2 - Spring Boot logger";
    Logger logger = LogManager.getLogger(LogController.class);

    @GetMapping("/")
    public String home() {
        logger.info("HomeController - OK");

        return message;
    }
}
