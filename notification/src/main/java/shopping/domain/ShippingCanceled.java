package shopping.domain;

import shopping.domain.*;
import shopping.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ShippingCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private String itemid;
    private Long orderid;
    private String status;
}


