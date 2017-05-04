package com.astronauts.astronaut.dao;

import java.net.URI;
import java.util.Date;

/**
 * Created by end on 01.05.17.
 */

public class Entry {

    private int id;
    private String author;
    private Avatar authorAvatar;
    private URI authorGroup;
    private Date date;
    private String body;
    private URI url;
    private String receiver;
    private Avatar receiverAvatar;
    private URI receiverGroup;
    private EntryComment[] comments;
    private int voteCount;
    private int userVote;
    private Dig[] voters;
    private boolean userFavorite;
    private Embed embed;

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

    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public URI getReceiverGroup() {
        return receiverGroup;
    }

    public void setReceiverGroup(URI receiverGroup) {
        this.receiverGroup = receiverGroup;
    }

    public EntryComment[] getComments() {
        return comments;
    }

    public void setComments(EntryComment[] comments) {
        this.comments = comments;
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

    public Dig[] getVoters() {
        return voters;
    }

    public void setVoters(Dig[] voters) {
        this.voters = voters;
    }

    public boolean isUserFavorite() {
        return userFavorite;
    }

    public void setUserFavorite(boolean userFavorite) {
        this.userFavorite = userFavorite;
    }

    public Embed getEmbed() {
        return embed;
    }

    public void setEmbed(Embed embed) {
        this.embed = embed;
    }

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

    public Avatar getReceiverAvatar() {
        return receiverAvatar;
    }

    public void setReceiverAvatar(Avatar receiverAvatar) {
        this.receiverAvatar = receiverAvatar;
    }

    public Entry(int id, String author, Avatar authorAvatar, URI authorGroup, Date date, String body, URI url, String receiver, Avatar receiverAvatar, URI receiverGroup, EntryComment[] comments, int voteCount, int userVote, Dig[] voters, boolean userFavorite, Embed embed) {
        this.id = id;
        this.author = author;
        this.authorAvatar = authorAvatar;
        this.authorGroup = authorGroup;
        this.date = date;
        this.body = body;
        this.url = url;
        this.receiver = receiver;
        this.receiverAvatar = receiverAvatar;
        this.receiverGroup = receiverGroup;
        this.comments = comments;
        this.voteCount = voteCount;
        this.userVote = userVote;
        this.voters = voters;
        this.userFavorite = userFavorite;
        this.embed = embed;
    }
}
