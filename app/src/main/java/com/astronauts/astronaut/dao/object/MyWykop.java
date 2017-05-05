package com.astronauts.astronaut.dao.object;

/**
 * Created by end on 01.05.17.
 */

public class MyWykop {

    //Only entry functionality is implemented as we are more focused on mikroblog than main page right now
    //For time being just filter JSON object so it only provides entry EmbedType objects
    //NEEDS TESTING - Api documentation is too poorly written to understand what exactly it will work with

    private Enum.MyWykopType dataMyWykopType;
    private EntryBasics[] entries;

    public MyWykop(EntryBasics[] entries) {
        dataMyWykopType = Enum.MyWykopType.entry;
        this.entries = entries;
    }

}
