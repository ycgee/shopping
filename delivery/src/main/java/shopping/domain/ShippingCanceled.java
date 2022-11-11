package shopping.domain;

import shopping.domain.*;
import shopping.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ShippingCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private String itemid;
    private Long orderid;
    private String status;

    public ShippingCanceled(Shipping aggregate){
        super(aggregate);
    }
    public ShippingCanceled(){
        super();
    }
}
