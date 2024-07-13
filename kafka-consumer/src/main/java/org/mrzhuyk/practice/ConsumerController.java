package org.mrzhuyk.practice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @KafkaListener(id = "myId", topics = KafkaConfig.TOPIC_1)
    public void listen(String in) {
        System.out.println(in);
    }
    
}
