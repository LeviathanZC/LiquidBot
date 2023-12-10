package com.ecorp.LiquidBot.model.entity.order;

import com.ecorp.LiquidBot.model.entity.Identifiable;
import com.ecorp.LiquidBot.model.entity.management.Nomenclature;
import lombok.*;

//import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Map;

//@Entity
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order extends Identifiable {

    private Map<Nomenclature, Integer> orderList;

    private LocalDate orderDate;

    private Map<OrderStatus, LocalDate> status;

}
