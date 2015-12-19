package com.edwinhollen.curtaincall;

/**
 * Created by Fubar on 12/19/2015.
 */
public class Performer extends Person{

    public Performer(){
        super();


    }

    public float getSingingAbility(){
        return this.previousProductions.stream().mapToInt(production -> {
            return production.getGenre() == Production.Genre.MUSICAL ? 3 : 1;
        }).sum() / previousProductions.size();
    }

    public float getDancingAbility(){
        return this.previousProductions.stream().mapToInt(production -> {
            return production.getGenre() == Production.Genre.MUSICAL ? 3 : 1;
        }).sum() / previousProductions.size();
    }
}
