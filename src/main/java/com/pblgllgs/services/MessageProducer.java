package com.pblgllgs.services;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MessageProducer {
    private final RabbitTemplate rabbitTemplate;

    @Value("${broker.queue.name}")
    private String routingKey;

    public void publisherMessageEmail(String message) {

        rabbitTemplate.convertAndSend("", routingKey, message);
    }
}