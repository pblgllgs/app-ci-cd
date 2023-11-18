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

    @Value("${broker.key.name}")
    private String routingKey;

    public void publisherMessageEmail(Message message) {
        rabbitTemplate.convertAndSend("ex_logstash", routingKey, message);
    }
}
