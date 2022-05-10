package kafka.kafkasample.service;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "json_topic", groupId = "kafka")
    public void consume(String message) throws IOException {
        System.out.printf("consumed json message : %s%n", message);

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(message);
            JSONObject jsonObj = (JSONObject) obj;

            String msg = (String) jsonObj.get("msg");
            System.out.printf("Consumed message : %s%n", msg);
        } catch (ParseException ignored) {
            //
        }
    }

}
