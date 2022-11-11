package shopping.domain;

import shopping.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class Shipped extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private String itemid;
    private Long orderid;
    private String status;
}
