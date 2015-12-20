package com.edwinhollen.curtaincall;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Fubar on 12/19/2015.
 */
public class Production {
    private String title;
    private List<Performer> performers;
    private Collection<Crewmember> crew;
    private Genre genre;

    public Production(String title, List<Performer> performers, Collection<Crewmember> crew, Genre genre) {
        this.title = title;
        this.performers = performers;
        this.crew = crew;
        this.genre = genre;
    }

    public Production(){
        this(
            Pick.title(),
            new LinkedList<>(),
            new LinkedList<>(),
            Pick.fromArray(Genre.values())
        );
    }

    public Genre getGenre(){
        return this.genre;
    }


    public enum Genre{
        PLAY,
        MUSICAL
    }
}
