package com.springbootlogger.log4j2.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    String logMessage = "Logging output via Log4j2..";
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String log() {
        logger.trace("Log4j2 - A TRACE level message");
        logger.debug("Log4j2 - A DEBUG level message");
        logger.info("Log4j2 - A INFO level message");
        logger.warn("Log4j2 - A WARN level message");
        logger.error("Log4j2 - A ERROR level message");

        return logMessage;
    }
}
