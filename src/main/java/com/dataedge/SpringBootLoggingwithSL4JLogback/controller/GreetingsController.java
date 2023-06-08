package com.dataedge.SpringBootLoggingwithSL4JLogback.controller;

import com.dataedge.SpringBootLoggingwithSL4JLogback.SpringBootLoggingWithSl4JLogbackApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    Logger log = LoggerFactory.getLogger(SpringBootLoggingWithSl4JLogbackApplication.class);

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name) {
        log.debug("Request {}", name);
        if (name.equalsIgnoreCase("test")) {
            throw new RuntimeException("Exception raised!!");
        }
        String response = "Hi " + name + " Welcome to Java SpringBoot Logging demo";
        log.debug("Response {}", response);
        return response;
    }
}
