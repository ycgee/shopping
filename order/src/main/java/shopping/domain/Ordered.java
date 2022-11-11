package shopping.domain;

import shopping.domain.*;
import shopping.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String address;
    private Long itemid;
    private Integer qty;
    private String customerid;

    public Ordered(Order aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
