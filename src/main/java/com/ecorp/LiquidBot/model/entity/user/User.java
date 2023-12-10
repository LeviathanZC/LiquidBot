package com.ecorp.LiquidBot.model.entity.user;

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
public class User extends Identifiable {

    private long userId;
    private String firstName;
    private String lastName;
    private String userName;
    private UserRole role;

}
