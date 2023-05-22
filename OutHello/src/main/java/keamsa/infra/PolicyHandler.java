package keamsa.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import keamsa.config.kafka.KafkaProcessor;
import keamsa.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    WorldRepository worldRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Hellod'"
    )
    public void wheneverHellod_Increasecount(@Payload Hellod hellod) {
        Hellod event = hellod;
        System.out.println(
            "\n\n##### listener Increasecount : " + hellod + "\n\n"
        );
        // Sample Logic //

    }
}
