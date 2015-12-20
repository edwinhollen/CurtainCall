package com.edwinhollen.curtaincall;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Edwin on 12/19/15
 */
public abstract class Person {
    protected static final Map<Integer, Double> AGE_WEIGHTS = new LinkedHashMap<Integer, Double>(){{
        put(20, 0.5);
        put(30, 0.85);
        put(40, 0.65);
        put(50, 0.4);
        put(60, 0.1);
    }};
    protected String firstName, lastName;
    protected Gender gender;
    protected int age;
    protected Collection<Production> previousProductions;

    public Person(){
        this.gender = Pick.gender();
        this.firstName = Pick.firstName(this.gender);
        this.lastName = Pick.lastName();
        this.age = Pick.weighted(AGE_WEIGHTS) + Pick.between(-10, 10);

        this.previousProductions = new LinkedList<Production>(){{
            for(int i = 0; i < Pick.between(0, 10); i++){
                add(new Production());
            }
        }};
    }

    public abstract int getExperienceLevel();

    @Override
    public String toString() {
        return String.format("%s %s\t(%s)\tage %d", firstName, lastName, gender.toString(), age);
    }
}
