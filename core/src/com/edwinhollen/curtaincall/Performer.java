package com.edwinhollen.curtaincall;

import java.util.Collection;

/**
 * Created by Fubar on 12/19/2015.
 */
public class Performer {
    String firstName, lastName;

    int age;
    float singingAbility;
    float actingAbility;
    float danceAbility;
    Collection<Production> previousProductions;

    public Performer(){

    }

    public int getExperienceLevel(){
        return previousProductions.stream().mapToInt(production -> {
            return production.getLeadingPerformer().equals(this) ? 3 : 1;
        }).sum();
    }
}
