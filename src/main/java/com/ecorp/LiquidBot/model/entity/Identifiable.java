package com.ecorp.LiquidBot.model.entity;

import lombok.Getter;
import lombok.ToString;

//import javax.persistence.*;
import java.io.Serializable;

/**
 * A base class for all identifiable entities.
 */
//@MappedSuperclass
@Getter
@ToString
public abstract class Identifiable implements Serializable {

    /**
     * The ID of the entity.
     */
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)*/
    private Long id;


    /**
     * Indicates whether the current object is equal to another object.
     *
     * @param o The other object to compare to.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Identifiable that = (Identifiable) o;
        return id != null ? id.equals(that.id) : that.id == null;
    }

    /**
     * Generates a hash code for the object based on its ID.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
