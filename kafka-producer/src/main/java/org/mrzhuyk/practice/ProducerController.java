package org.mrzhuyk.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    public KafkaTemplate kafkaTemplate;
    
    
    @Scheduled(cron = "0/5 * * * * *")
    public void send() {
        kafkaTemplate.send(KafkaConfig.TOPIC_1, "定时任务");
    }
}
