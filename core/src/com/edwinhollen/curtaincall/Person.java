package com.edwinhollen.curtaincall;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Edwin on 12/19/15
 */
public class Person {
    protected static final Map<Integer, Double> AGE_WEIGHTS = new LinkedHashMap<Integer, Double>(){{
        put(20, 0.7);
        put(30, 0.8);
        put(40, 0.7);
        put(50, 0.4);
        put(60, 0.2);
    }};
    private String firstName, lastName;
    private Gender gender;
    private int age;
    private Collection<Production> previousProductions;

    public Person(){
        this.gender = Pick.gender();
        this.firstName = Pick.firstName(this.gender);
        this.lastName = Pick.lastName();
        this.age = Pick.weighted(AGE_WEIGHTS) + Pick.between(-10, 10);
    }

    public int getExperienceLevel(){
        return previousProductions.stream().mapToInt(production -> {
            return production.getLeadingPerformer().equals(this) ? 3 : 1;
        }).sum();
    }

    @Override
    public String toString() {
        return String.format("%s %s\t(%s)\tage %d", firstName, lastName, gender.toString(), age);
    }
}
