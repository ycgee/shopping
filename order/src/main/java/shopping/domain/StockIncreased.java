package shopping.domain;

import shopping.domain.*;
import shopping.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer qty;
}


