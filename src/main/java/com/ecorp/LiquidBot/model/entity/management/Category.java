package com.ecorp.LiquidBot.model.entity.management;

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
public class Category extends Identifiable {

    private String name;

    private String description;

    private long viewCounter;

    private void incrementCounter(){
        this.viewCounter++;
    }

}
