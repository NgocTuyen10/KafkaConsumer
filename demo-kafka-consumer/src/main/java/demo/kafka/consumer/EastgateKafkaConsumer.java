package demo.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EastgateKafkaConsumer {
	
	
	@KafkaListener(topics = "${event.topic.name}", groupId = "${event.groupId}")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

}
