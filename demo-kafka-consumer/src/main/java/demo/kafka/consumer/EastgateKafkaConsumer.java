package demo.kafka.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EastgateKafkaConsumer {
	 private String topic;
	// private String groupid;
	// private Properties props;
	public String setTopic() {
		return topic;
	}
	@KafkaListener(topics = "abc", groupId = "test-consumer-group")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

}
