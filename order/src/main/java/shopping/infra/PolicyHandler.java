package shopping.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import shopping.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shopping.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='StockIncreased'")
    public void wheneverStockIncreased_대기고객에게알림메일을발송(@Payload StockIncreased stockIncreased){

        StockIncreased event = stockIncreased;
        System.out.println("\n\n##### listener 대기고객에게알림메일을발송 : " + stockIncreased + "\n\n");


        

        // Sample Logic //
        Order.대기고객에게알림메일을발송(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Shipped'")
    public void wheneverShipped_주문상태갱신(@Payload Shipped shipped){

        Shipped event = shipped;
        System.out.println("\n\n##### listener 주문상태갱신 : " + shipped + "\n\n");


        

        // Sample Logic //
        Order.주문상태갱신(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ShippingCanceled'")
    public void wheneverShippingCanceled_주문상태갱신(@Payload ShippingCanceled shippingCanceled){

        ShippingCanceled event = shippingCanceled;
        System.out.println("\n\n##### listener 주문상태갱신 : " + shippingCanceled + "\n\n");


        

        // Sample Logic //
        Order.주문상태갱신(event);
        

        

    }

}


