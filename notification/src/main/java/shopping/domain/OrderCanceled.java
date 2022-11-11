package shopping.domain;

import shopping.domain.*;
import shopping.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Long itemid;
    private Integer qty;
    private String customerid;
}


