package shopping.infra;
import shopping.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class ShippingHateoasProcessor implements RepresentationModelProcessor<EntityModel<Shipping>>  {

    @Override
    public EntityModel<Shipping> process(EntityModel<Shipping> model) {

        
        return model;
    }
    
}
