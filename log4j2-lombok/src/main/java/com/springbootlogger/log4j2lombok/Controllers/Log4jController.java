package com.springbootlogger.log4j2lombok.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class Log4jController {
    String message = "Logging output via Log4j2 with Lombok..";

    @GetMapping("/log4j-lombok")
    public String log4j() {
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");

        return message;
    }
}
