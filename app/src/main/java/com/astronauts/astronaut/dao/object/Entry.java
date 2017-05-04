package com.astronauts.astronaut.dao.object;

import java.net.URI;
import java.util.Date;
import java.util.List;

/**
 * Created by end on 01.05.17.
 */

public class Entry extends EntryComment implements EntryBasics {

    private URI url;
    private String receiver;
    private Avatar receiverAvatar;
    private URI receiverGroup;
    private List<EntryComment> comments;
    private boolean userFavorite;

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

    public List<EntryComment> getComments() {
        return comments;
    }

    public void setComments(List<EntryComment> comments) {
        this.comments = comments;
    }

    public boolean isUserFavorite() {
        return userFavorite;
    }

    public void setUserFavorite(boolean userFavorite) {
        this.userFavorite = userFavorite;
    }

    public Avatar getReceiverAvatar() {
        return receiverAvatar;
    }

    public void setReceiverAvatar(Avatar receiverAvatar) {
        this.receiverAvatar = receiverAvatar;
    }

    public Entry(int id, String author, Avatar authorAvatar, URI authorGroup, Date date, String body, URI url, String receiver, Avatar receiverAvatar, URI receiverGroup, List<EntryComment> comments, int voteCount, int userVote, List<Dig> voters, boolean userFavorite, Embed embed) {
        super(id, author, authorAvatar, authorGroup, date, body, voteCount, userVote, voters, embed, null);
        this.url = url;
        this.receiver = receiver;
        this.receiverAvatar = receiverAvatar;
        this.receiverGroup = receiverGroup;
        this.comments = comments;
        this.userFavorite = userFavorite;
    }

}
