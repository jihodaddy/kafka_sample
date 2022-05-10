package kafka.kafkasample.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC = "json_topic";
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaProducer(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        System.out.printf("Produce message : %s%n", message);

        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // yyyy-MM-dd HH:mm:ss
        System.out.println(df.format(now));

        JSONObject data = new JSONObject();
        data.put("dt", df.format(now));
        data.put("msg", message);

        System.out.printf("Produce json message : %s%n", data.toJSONString());
        this.kafkaTemplate.send(TOPIC, data.toJSONString());
    }
}
