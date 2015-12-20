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
    private final static String[] NOUNS = {
            "Dream", "Dreamer", "Dreams", "Waves",
            "Sword", "Kiss", "Sex", "Lover",
            "Slave", "Slaves", "Pleasure", "Servant",
            "Servants", "Snake", "Soul", "Touch",
            "Men", "Women", "Gift", "Scent",
            "Ice", "Snow", "Night", "Silk", "Secret", "Secrets",
            "Game", "Fire", "Flame", "Flames",
            "Husband", "Wife", "Man", "Woman", "Boy", "Girl",
            "Truth", "Edge", "Boyfriend", "Girlfriend",
            "Body", "Captive", "Male", "Wave", "Predator",
            "Female", "Healer", "Trainer", "Teacher",
            "Hunter", "Obsession", "Hustler", "Consort",
            "Dream",  "Dreamer",  "Dreams", "Rainbow",
            "Dreaming", "Flight", "Flying", "Soaring",
            "Wings", "Mist", "Sky", "Wind",
            "Winter", "Misty", "River", "Door",
            "Gate", "Cloud", "Fairy", "Dragon",
            "End", "Blade", "Beginning", "Tale",
            "Tales", "Emperor", "Prince", "Princess",
            "Willow", "Birch", "Petals", "Destiny",
            "Theft", "Thief", "Legend", "Prophecy",
            "Spark", "Sparks", "Stream", "Streams", "Waves",
            "Sword", "Darkness", "Swords", "Silence", "Kiss",
            "Butterfly", "Shadow", "Ring", "Rings", "Emerald",
            "Storm", "Storms", "Mists", "World", "Worlds",
            "Alien", "Lord", "Lords", "Ship", "Ships", "Star",
            "Stars", "Force", "Visions", "Vision", "Magic",
            "Wizards", "Wizard", "Heart", "Heat", "Twins",
            "Twilight", "Moon", "Moons", "Planet", "Shores",
            "Pirates", "Courage", "Time", "Academy",
            "School", "Rose", "Roses", "Stone", "Stones",
            "Sorcerer", "Shard", "Shards", "Slave", "Slaves",
            "Servant", "Servants", "Serpent", "Serpents",
            "Snake", "Soul", "Souls", "Savior", "Spirit",
            "Spirits", "Voyage", "Voyages", "Voyager", "Voyagers",
            "Return", "Legacy", "Birth", "Healer", "Healing",
            "Year", "Years", "Death", "Dying", "Luck", "Elves",
            "Tears", "Touch", "Son", "Sons", "Child", "Children",
            "Illusion", "Sliver", "Destruction", "Crying", "Weeping",
            "Gift", "Word", "Words", "Thought", "Thoughts", "Scent",
            "Ice", "Snow", "Night", "Silk", "Guardian", "Angel",
            "Angels", "Secret", "Secrets", "Search", "Eye", "Eyes",
            "Danger", "Game", "Fire", "Flame", "Flames", "Bride",
            "Husband", "Wife", "Time", "Flower", "Flowers",
            "Light", "Lights", "Door", "Doors", "Window", "Windows",
            "Bridge", "Bridges", "Ashes", "Memory", "Thorn",
            "Thorns", "Name", "Names", "Future", "Past",
            "History", "Something", "Nothing", "Someone",
            "Nobody", "Person", "Man", "Woman", "Boy", "Girl",
            "Way", "Mage", "Witch", "Witches", "Lover",
            "Tower", "Valley", "Abyss", "Hunter",
            "Truth", "Edge"
    };

    public static final String[] ADJECTIVES = {
            "Lost", "Only", "Last", "First",
            "Third", "Sacred", "Bold", "Lovely",
            "Final", "Missing", "Shadowy", "Seventh",
            "Dwindling", "Missing", "Absent",
            "Vacant", "Cold", "Hot", "Burning", "Forgotten",
            "Weeping", "Dying", "Lonely", "Silent",
            "Laughing", "Whispering", "Forgotten", "Smooth",
            "Silken", "Rough", "Frozen", "Wild",
            "Trembling", "Fallen", "Ragged", "Broken",
            "Cracked", "Splintered", "Slithering", "Silky",
            "Wet", "Magnificent", "Luscious", "Swollen",
            "Erect", "Bare", "Naked", "Stripped",
            "Captured", "Stolen", "Sucking", "Licking",
            "Growing", "Kissing", "Green", "Red", "Blue",
            "Azure", "Rising", "Falling", "Elemental",
            "Bound", "Prized", "Obsessed", "Unwilling",
            "Hard", "Eager", "Ravaged", "Sleeping",
            "Wanton", "Professional", "Willing", "Devoted",
            "Misty", "Lost", "Only", "Last", "First",
            "Final", "Missing", "Shadowy", "Seventh",
            "Dark", "Darkest", "Silver", "Silvery", "Living",
            "Black", "White", "Hidden", "Entwined", "Invisible",
            "Next", "Seventh", "Red", "Green", "Blue",
            "Purple", "Grey", "Bloody", "Emerald", "Diamond",
            "Frozen", "Sharp", "Delicious", "Dangerous",
            "Deep", "Twinkling", "Dwindling", "Missing", "Absent",
            "Vacant", "Cold", "Hot", "Burning", "Forgotten",
            "Some", "No", "All", "Every", "Each", "Which", "What",
            "Playful", "Silent", "Weeping", "Dying", "Lonely", "Silent",
            "Laughing", "Whispering", "Forgotten", "Smooth", "Silken",
            "Rough", "Frozen", "Wild", "Trembling", "Fallen",
            "Ragged", "Broken", "Cracked", "Splintered"
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

    public static String noun(){
        return fromArray(NOUNS);
    }

    public static String adjective(){
        return fromArray(ADJECTIVES);
    }

    public static String title(TitleType titleType){
        switch(titleType){
            case Noun:
                return String.format("%s", noun());
            case AdjectiveNoun:
                return String.format("%s %s", adjective(), noun());
            case TheAdjectiveNoun:
                return String.format("The %s %s", adjective(), noun());
            case NounOfNoun:
                return String.format("%s of %s", noun(), noun());
            case TheNounsNoun:
                return String.format("The %s's %s", noun(), noun());
            case TheNounOfTheNoun:
                return String.format("The %s of the %s", noun(), noun());
            case NounInTheNoun:
                return String.format("%s in the %s", noun(), noun());
            default:
                return null;
        }
    }

    public static String title(){
        return title(fromArray(TitleType.values()));
    }

    enum TitleType{
        Noun,
        AdjectiveNoun,
        TheAdjectiveNoun,
        NounOfNoun,
        TheNounsNoun,
        TheNounOfTheNoun,
        NounInTheNoun,
    }


}
