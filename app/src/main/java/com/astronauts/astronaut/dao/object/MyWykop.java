package com.astronauts.astronaut.dao.object;

/**
 * Created by end on 01.05.17.
 */

public class MyWykop {

    //Only entry functionality is implemented as we are more focused on mikroblog than main page right now
    //For time being just filter JSON object so it only provides entry type objects
    //NEEDS TESTING - Api documentation is too poorly written to understand what exactly it will work with

    public enum type {link,entry}

    private type dataType;
    private EntryBasics[] entries;

    public MyWykop(EntryBasics[] entries){
        dataType=type.entry;
        this.entries=entries;
    }

}
