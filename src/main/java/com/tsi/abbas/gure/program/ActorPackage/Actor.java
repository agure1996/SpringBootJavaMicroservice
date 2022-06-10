package com.tsi.abbas.gure.program.ActorPackage;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;



import javax.persistence.*;

@Entity
@Table(name="actor")

public class Actor {

    /**
     *
     * @param actorId is the ID of the customer, a variable to replicate actor in actor sakila database table
     * @param firstName is firstname variable of the actor
     * @param lastName is the lastname variable for our actor class
     */


    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int actorId;
    public String firstName;
    public String lastName;


    /**
     * This is the basic constructor of the actor details that we will edit, we don't add the ID
     * due to ID being auto-incremental in the database when we add a new actor.
     * @param firstName is firstname variable of the actor
     * @param lastName is the lastname variable for our actor class
     */
    public Actor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    /**
     * This is a beanbag constructor (google for definition)
     */
    public Actor() {

    }

    /**
     *
     * Consists of setters and getters of the actor class variables
     */

    public void setActorID(int actorId) {
        this.actorId = actorId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActorID() {
        return actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
