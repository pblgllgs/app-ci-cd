package com.pblgllgs.controller;

import com.pblgllgs.Message;
import com.pblgllgs.services.LogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.UUID;

@RestController
@RequestMapping("/hello")
@Slf4j
@RequiredArgsConstructor
public class Controller {
    private final LogService logService;

    @GetMapping
    public void hello() {
        Message message =  Message.builder()
                .id(UUID.randomUUID().toString())
                .message("<----------------Hello from logs!!!--------------->" + Instant.now().toString())
                .build();
        logService.sendLogMessage(message);
    }
}
