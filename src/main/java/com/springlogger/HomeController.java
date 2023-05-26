package com.springlogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/hello")
    public String hello()
    {
        logger.error("Logger Error");
        logger.warn("Logger Warn");
        logger.info("FATAL ERROR");
        logger.debug("Logger debug");
        logger.trace("Logger Trace");
        return "Hello I'm learning logger!!";
    }
}