package com.elk.controller;

import com.elk.publisher.LogsPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class LogController {

    private final LogsPublisher logsPublisher;

    public LogController(LogsPublisher logsPublisher) {
        this.logsPublisher = logsPublisher;
    }

    @GetMapping("/log")
    public String logMessage() {
        log.info("Inside log message function");
        String response = "Hello World! " + new Date();
        log.info("Response => {}",response);
        return response;
    }

}
