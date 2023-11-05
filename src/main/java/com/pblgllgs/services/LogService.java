package com.pblgllgs.services;

import com.pblgllgs.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class LogService {
    private final RabbitTemplate rabbitTemplate;

    public LogService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendLogMessage(Message message) {
        rabbitTemplate.convertAndSend("your-queue-name", message);
    }
}
