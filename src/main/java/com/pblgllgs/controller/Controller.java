package com.pblgllgs.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
@RequiredArgsConstructor
public class Controller {

    @GetMapping
    public void hello() {
        log.info("HELLO");
    }
}
