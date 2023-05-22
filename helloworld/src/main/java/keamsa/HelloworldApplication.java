package keamsa;

import keamsa.config.kafka.KafkaProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableBinding(KafkaProcessor.class)
@EnableFeignClients
public class HelloworldApplication {

    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext =
            SpringApplication.run(HelloworldApplication.class, args);
    }
}
