package com.ecorp.LiquidBot.model.entity;

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
public class City extends Identifiable {

    private String name;

    private long shopCounter;

    private long userCounter;

    private void incrementShop(){
        this.shopCounter += 1;
    }
    private void decrementShop(){
        this.shopCounter -= 1;
    }
    private void incrementUser(){
        this.userCounter += 1;
    }
    private void decrementUser(){
        this.userCounter -= 1;
    }

}
