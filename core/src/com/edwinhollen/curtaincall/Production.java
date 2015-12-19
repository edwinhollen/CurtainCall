package com.edwinhollen.curtaincall;

import java.util.Collection;
import java.util.List;

/**
 * Created by Fubar on 12/19/2015.
 */
public class Production {
    private String title;
    private List<Performer> performers;
    private Collection<Crewmember> crew;
    private Genre genre;

    public Performer getLeadingPerformer(){
        return performers.get(0);
    }


    public enum Genre{
        PLAY,
        MUSICAL
    }
}
