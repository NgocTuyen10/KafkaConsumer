package demo.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoKafkaConsumerApplication.class, args);
	}
}
