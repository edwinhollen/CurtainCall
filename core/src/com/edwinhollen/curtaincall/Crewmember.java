package com.edwinhollen.curtaincall;

/**
 * Created by Fubar on 12/19/2015.
 */
public class Crewmember extends Person{
    public Crewmember(){
        super();
    }

    @Override
    public int getExperienceLevel() {
        return this.previousProductions.size();
    }
}
