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
    @Autowired StockRepository stockRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Shipped'")
    public void wheneverShipped_UpdateStock(@Payload Shipped shipped){

        Shipped event = shipped;
        System.out.println("\n\n##### listener UpdateStock : " + shipped + "\n\n");


        

        // Sample Logic //
        Stock.updateStock(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='ShippingCanceled'")
    public void wheneverShippingCanceled_UpdateStock(@Payload ShippingCanceled shippingCanceled){

        ShippingCanceled event = shippingCanceled;
        System.out.println("\n\n##### listener UpdateStock : " + shippingCanceled + "\n\n");


        

        // Sample Logic //
        Stock.updateStock(event);
        

        

    }

}


