package com.elk.publisher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogsPublisher {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public LogsPublisher(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendLogs(String message) {
        kafkaTemplate.send("logs-topic", message);
    }
}
