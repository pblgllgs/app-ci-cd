package com.pblgllgs.service;
/*
 *
 * @author pblgl
 * Created on 17-11-2023
 *
 */

import com.pblgllgs.model.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageProducer {
    private final RabbitTemplate rabbitTemplate;

    @Value("${broker.name.key}")
    private String routingKey;

    @Value("${broker.name.exchange}")
    private String exchange;

    public void publisherMessageEmail(Message message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }
}
