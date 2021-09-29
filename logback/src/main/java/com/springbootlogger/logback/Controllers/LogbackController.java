package com.springbootlogger.logback.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogbackController {
    String message = "Logging via Logback..";
    Logger logger = LoggerFactory.getLogger(LogbackController.class);

    @GetMapping("/logback")
    public String home() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        
        return message;
    }
}
