package com.astronauts.astronaut.dao;

import java.net.URI;
import java.util.Date;
import java.util.List;

/**
 * Created by end on 04.05.17.
 */

public class EntryComment implements EntryBasics {

    private int id;
    private String author;
    private Avatar authorAvatar;
    private URI authorGroup;
    private Date date;
    private String body;
    private int voteCount;
    private int userVote;
    private List<Dig> voters;
    private Embed embed;
    private Entry entry;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Avatar getAuthorAvatar() {
        return authorAvatar;
    }

    public void setAuthorAvatar(Avatar authorAvatar) {
        this.authorAvatar = authorAvatar;
    }

    public URI getAuthorGroup() {
        return authorGroup;
    }

    public void setAuthorGroup(URI authorGroup) {
        this.authorGroup = authorGroup;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public int getUserVote() {
        return userVote;
    }

    public void setUserVote(int userVote) {
        this.userVote = userVote;
    }

    public List<Dig> getVoters() {
        return voters;
    }

    public void setVoters(List<Dig> voters) {
        this.voters = voters;
    }

    public Embed getEmbed() {
        return embed;
    }

    public void setEmbed(Embed embed) {
        this.embed = embed;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public EntryComment(int id, String author, Avatar authorAvatar, URI authorGroup, Date date, String body, int voteCount, int userVote, List<Dig> voters, Embed embed, Entry entry) {
        this.id = id;
        this.author = author;
        this.authorAvatar = authorAvatar;
        this.authorGroup = authorGroup;
        this.date = date;
        this.body = body;
        this.voteCount = voteCount;
        this.userVote = userVote;
        this.voters = voters;
        this.embed = embed;
        this.entry = entry;
    }
}
