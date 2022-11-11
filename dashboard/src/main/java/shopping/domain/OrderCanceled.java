package shopping.domain;

import shopping.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Long itemid;
    private Integer qty;
    private String customerid;
}
