package com.ecorp.LiquidBot.model.entity.management;


import com.ecorp.LiquidBot.model.entity.City;
import com.ecorp.LiquidBot.model.entity.Identifiable;
import lombok.*;

//import javax.persistence.Entity;

//@Entity
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Nomenclature extends Identifiable {

    private Category category;

    private Brand brand;

    private City city;

    private String name;

    private String productLine;

    private String imageLink;

    private boolean isAvailable;

    private int totalQuantity;
    private int inStockQuantity;
    private int bookedQuantity;
    private int price;
    private int purchasePrice;
    private int volume;
    private int pg;
    private int vg;
    private int strength;
    private boolean isCooling;
    private Taste taste;
    private String detailedTaste;
    private boolean isBatteryIntegrated;
    private boolean hasDisplay;
    private boolean hasPowerController;
    private int batteryCapacity;
    private int puffCounter;
    private long viewCounter;

    private void incrementCounter(){
        this.viewCounter += 1;
    }

}
