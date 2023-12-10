package com.ecorp.LiquidBot.model.entity.user;

import com.ecorp.LiquidBot.model.entity.City;
import com.ecorp.LiquidBot.model.entity.Identifiable;
import lombok.*;

/*import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;*/

//@Entity
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserSettings extends Identifiable {

    private String phone;

/*    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)*/
    private City city;

    private boolean isNotify;

    private boolean isAdvertisingNotify;

}
