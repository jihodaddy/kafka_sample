package kafka.kafkasample.service;

import java.io.IOException;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "exam", groupId = "kafka")
    public void consume(String message) throws IOException {
        System.out.printf("consumed message : %s%n", message);
    }

}
