package org.mrzhuyk.practice;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    
    public static final String TOPIC_1 = "topic1";
    
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(TOPIC_1)
            .partitions(1)
            .replicas(1)
            .build();
    }
    
}
