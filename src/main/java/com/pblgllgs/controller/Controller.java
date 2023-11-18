package com.pblgllgs.controller;

import com.pblgllgs.model.Message;
import com.pblgllgs.service.MessageProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@Slf4j
@RequiredArgsConstructor
public class Controller {
    private final MessageProducer messageProducer;

    @PostMapping("/hello")
    public void hello(@RequestBody Message message) {
        Message msg = Message.builder()
                .id(message.getId())
                .content(message.getContent())
                .build();
        log.info(String.valueOf(msg));
    }

    @PostMapping("/email")
    public void publisherMessageEmail(@RequestBody Message message) {
        messageProducer.publisherMessageEmail(message);
    }
}