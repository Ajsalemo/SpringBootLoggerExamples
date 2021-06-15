package com.springbootlogger.log4j2lombok.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Slf4jController {
    String message = "Logging output via Slf4j2 with Lombok..";

    @GetMapping("/slf4j")
    public String slf4j() {
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");

        return message;
    }
}
