package shopping.domain;

import shopping.domain.*;
import shopping.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer qty;

    public StockIncreased(Stock aggregate){
        super(aggregate);
    }
    public StockIncreased(){
        super();
    }
}
