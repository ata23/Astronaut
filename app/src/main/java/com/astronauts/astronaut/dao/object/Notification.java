package com.astronauts.astronaut.dao.object;

import java.net.URI;
import java.util.Date;

/**
 * Created by end on 04.05.17.
 */

public class Notification {

    public enum Type {
        register,
        observe,
        unobserve,
        entryCommentDirected,
        entryDirected,
        entryTag,
        linkCommentDirected,
        linkPromoted,
        linkDirected,
        system,
        badge,
        supportAnswer,
        channelRequest,
        channelAccepted,
        channelRejected,
        pm
    }

    private String author;
    private Avatar authorAvatar;
    private int authorGroup;
    private Date date;
    private String body;
    private Type notificationType;
    private boolean isRead;
    private URI url;
    //Variables below this comment need to be tested.
    //private Entry entry;

    public Notification(String author, Avatar authorAvatar, int authorGroup, Date date, String body, Type notificationType, boolean isRead, URI url, Entry entry) {
        this.author = author;
        this.authorAvatar = authorAvatar;
        this.authorGroup = authorGroup;
        this.date = date;
        this.body = body;
        this.notificationType = notificationType;
        this.isRead = isRead;
        this.url = url;
    }
}
