package keamsa.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import keamsa.config.kafka.KafkaProcessor;
import keamsa.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class HelloworldViewHandler {

    @Autowired
    private HelloworldRepository helloworldRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenHellod_then_CREATE_1(@Payload Hellod hellod) {
        try {
            if (!hellod.validate()) return;

            // view 객체 생성
            Helloworld helloworld = new Helloworld();
            // view 객체에 이벤트의 Value 를 set 함
            helloworld.setHellodId(Long.valueOf(hellod.getHello()));
            helloworld.setHello(hellod.getHello());
            // view 레파지 토리에 save
            helloworldRepository.save(helloworld);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenWorlded_then_CREATE_2(@Payload Worlded worlded) {
        try {
            if (!worlded.validate()) return;

            // view 객체 생성
            Helloworld helloworld = new Helloworld();
            // view 객체에 이벤트의 Value 를 set 함
            helloworld.setWorldedId(worlded.getId());
            helloworld.setWorld(worlded.getWorld());
            helloworld.setCount(worlded.getCount());
            // view 레파지 토리에 save
            helloworldRepository.save(helloworld);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenHellod_then_UPDATE_1(@Payload Hellod hellod) {
        try {
            if (!hellod.validate()) return;
            // view 객체 조회

            List<Helloworld> helloworldList = helloworldRepository.findByHellodId(
                hellod.getId()
            );
            for (Helloworld helloworld : helloworldList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                helloworld.setHellodId(hellod.getId());
                helloworld.setHello(hellod.getHello());
                // view 레파지 토리에 save
                helloworldRepository.save(helloworld);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenWorlded_then_UPDATE_2(@Payload Worlded worlded) {
        try {
            if (!worlded.validate()) return;
            // view 객체 조회

            List<Helloworld> helloworldList = helloworldRepository.findByWorldedId(
                worlded.getId()
            );
            for (Helloworld helloworld : helloworldList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                helloworld.setWorldedId(worlded.getId());
                helloworld.setWorld(worlded.getWorld());
                helloworld.setCount(worlded.getCount());
                // view 레파지 토리에 save
                helloworldRepository.save(helloworld);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
