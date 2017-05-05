package com.astronauts.astronaut.dao;

import java.net.URI;

/**
 * Created by end on 01.05.17.
 */

public class Profile {

    private String login;
    private String email;
    private String publicEmail;
    private String name;
    private URI www;
    private String jabber;
    private int gg;
    private String city;
    private String about;
    private int authorGroup;
    private int linksAdded;
    private int linksPublished;
    private int comments;
    private int rank;
    private int followers;
    private int following;
    private int entries;
    private int entriesComments;
    private int digs;
    private int buries;
    private int relatedLinks;
    private int groups;
    private Avatar avatar;
    private boolean isObserved;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPublicEmail() {
        return publicEmail;
    }

    public void setPublicEmail(String publicEmail) {
        this.publicEmail = publicEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URI getWww() {
        return www;
    }

    public void setWww(URI www) {
        this.www = www;
    }

    public String getJabber() {
        return jabber;
    }

    public void setJabber(String jabber) {
        this.jabber = jabber;
    }

    public int getGg() {
        return gg;
    }

    public void setGg(int gg) {
        this.gg = gg;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getAuthorGroup() {
        return authorGroup;
    }

    public void setAuthorGroup(int authorGroup) {
        this.authorGroup = authorGroup;
    }

    public int getLinksAdded() {
        return linksAdded;
    }

    public void setLinksAdded(int linksAdded) {
        this.linksAdded = linksAdded;
    }

    public int getLinksPublished() {
        return linksPublished;
    }

    public void setLinksPublished(int linksPublished) {
        this.linksPublished = linksPublished;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getEntries() {
        return entries;
    }

    public void setEntries(int entries) {
        this.entries = entries;
    }

    public int getEntriesComments() {
        return entriesComments;
    }

    public void setEntriesComments(int entriesComments) {
        this.entriesComments = entriesComments;
    }

    public int getDigs() {
        return digs;
    }

    public void setDigs(int digs) {
        this.digs = digs;
    }

    public int getBuries() {
        return buries;
    }

    public void setBuries(int buries) {
        this.buries = buries;
    }

    public int getRelatedLinks() {
        return relatedLinks;
    }

    public void setRelatedLinks(int relatedLinks) {
        this.relatedLinks = relatedLinks;
    }

    public int getGroups() {
        return groups;
    }

    public void setGroups(int groups) {
        this.groups = groups;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public boolean isObserved() {
        return isObserved;
    }

    public void setObserved(boolean observed) {
        isObserved = observed;
    }

    public Profile(String login, String email, String publicEmail, String name, URI www, String jabber, int gg, String city, String about, int authorGroup, int linksAdded, int linksPublished, int comments, int rank, int followers, int following, int entries, int entriesComments, int digs, int buries, int relatedLinks, int groups, Avatar avatar, boolean isObserved) {
        this.login = login;
        this.email = email;
        this.publicEmail = publicEmail;
        this.name = name;
        this.www = www;
        this.jabber = jabber;
        this.gg = gg;
        this.city = city;
        this.about = about;
        this.authorGroup = authorGroup;
        this.linksAdded = linksAdded;
        this.linksPublished = linksPublished;
        this.comments = comments;
        this.rank = rank;
        this.followers = followers;
        this.following = following;
        this.entries = entries;
        this.entriesComments = entriesComments;
        this.digs = digs;
        this.buries = buries;
        this.relatedLinks = relatedLinks;
        this.groups = groups;
        this.avatar = avatar;
        this.isObserved = isObserved;
    }
}
