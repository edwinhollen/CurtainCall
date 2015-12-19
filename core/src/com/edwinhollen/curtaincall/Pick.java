package com.edwinhollen.curtaincall;

import java.util.Map;
import java.util.Random;

/**
 * Created by Fubar on 12/19/2015.
 */
public class Pick {
    /**
     * First names from
     * https://www.ssa.gov/oact/babynames/decades/century.html
     *
     * Last names from
     * http://names.mongabay.com/data/1000.html
     */
    private static final Random random = new Random();
    private static final String[] NAMES_MALE = {
            "James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Charles", "Thomas",
            "Christopher", "Daniel", "Matthew", "Donald", "Anthony", "Mark", "Paul", "Steven", "George", "Kenneth",
            "Andrew", "Edward", "Joshua", "Brian", "Kevin", "Ronald", "Timothy", "Jason", "Jeffrey", "Ryan", "Gary",
            "Nicholas", "Eric", "Jacob", "Stephen", "Jonathan", "Larry", "Frank", "Scott", "Justin", "Brandon",
            "Raymond", "Gregory", "Samuel", "Benjamin", "Patrick", "Jack", "Dennis", "Alexander", "Jerry"
    };
    private final static String[] NAMES_FEMALE = {
            "Mary", "Patricia", "Jennifer", "Elizabeth", "Linda", "Barbara", "Susan", "Margaret", "Jessica", "Sarah",
            "Dorothy", "Karen", "Nancy", "Betty", "Lisa", "Sandra", "Ashley", "Kimberly", "Donna", "Helen", "Carol",
            "Michelle", "Emily", "Amanda", "Melissa", "Deborah", "Laura", "Stephanie", "Rebecca", "Sharon", "Cynthia",
            "Kathleen", "Anna", "Shirley", "Ruth", "Amy", "Angela", "Brenda", "Virginia", "Pamela", "Catherine",
            "Nicole", "Christine", "Samantha", "Janet", "Debra", "Carolyn", "Rachel", "Heather"
    };
    private final static String[] NAMES_LAST = {
            "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson",
            "Martinez", "Anderson", "Taylor", "Thomas", "Hernandez", "Moore", "Martin", "Jackson", "Thompson", "White",
            "Lopez", "Lee", "Gonzalez", "Harris", "Clark", "Lewis", "Robinson", "Walker", "Perez", "Hall", "Young",
            "Allen", "Sanchez", "Wright", "King", "Scott", "Green", "Baker", "Adams", "Nelson", "Hill", "Ramirez",
            "Campbell", "Mitchell", "Roberts", "Carter", "Phillips", "Evans", "Turner", "Torres", "Parker", "Collins",
            "Edwards", "Stewart", "Flores", "Morris", "Nguyen", "Murphy", "Rivera", "Cook", "Rogers", "Morgan",
            "Peterson", "Cooper", "Reed", "Bailey", "Bell", "Gomez", "Kelly", "Howard", "Ward", "Cox", "Diaz",
            "Richardson", "Wood", "Watson", "Brooks", "Bennett", "Gray", "James", "Cruz", "Hughes", "Price", "Myers"
    };

    public static int between(int min, int max){
        return random.nextInt(max - min + 1) + min;
    }

    public static <T> T fromArray(T[] objs){
        return objs[random.nextInt(objs.length)];
    }

    public static String maleFirstName(){
        return fromArray(NAMES_MALE);
    }

    public static String femaleFirstName(){
        return fromArray(NAMES_FEMALE);
    }

    public static String firstName(){
        return firstName(fromArray(Gender.values()));
    }

    public static <E> E weighted(Map<E, Double> weights){
        E result = null;
        double bestValue = Double.MAX_VALUE;

        for(E element : weights.keySet()){
            double value = -Math.log(random.nextDouble()) / weights.get(element);

            if(value < bestValue){
                bestValue = value;
                result = element;
            }
        }

        return result;
    }

    public static Gender gender(){
        return fromArray(Gender.values());
    }

    public static String firstName(Gender gender){
        switch(gender){
            case MALE:
                return fromArray(NAMES_MALE);
            case FEMALE:
                return fromArray(NAMES_FEMALE);
        }
        return null;
    }

    public static String lastName(){
        return fromArray(NAMES_LAST);
    }

    public static String name(Gender gender){
        return String.format("%s %s", firstName(), lastName());
    }

    public static String name(){
        return name(fromArray(Gender.values()));
    }
}
