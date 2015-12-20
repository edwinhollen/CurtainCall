package com.edwinhollen.curtaincall;

/**
 * Created by Fubar on 12/19/2015.
 */
public class Performer extends Person{

    public Performer(){
        super();
    }

    @Override
    public int getExperienceLevel() {
        return getSingingAbility() + getDancingAbility() + getActingAbility();
    }

    public int getSingingAbility(){
        return this.previousProductions.stream().mapToInt(production -> {
            return production.getGenre() == Production.Genre.MUSICAL ? 3 : 1;
        }).sum();
    }

    public int getDancingAbility(){
        return this.previousProductions.stream().mapToInt(production -> {
            return production.getGenre() == Production.Genre.MUSICAL ? 3 : 1;
        }).sum();
    }

    public int getActingAbility(){
        return this.previousProductions.stream().mapToInt(production -> {
            return (production.getGenre() == Production.Genre.PLAY ? 3 : 1);
        }).sum();
    }
}
