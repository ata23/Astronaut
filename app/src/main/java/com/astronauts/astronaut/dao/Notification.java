package com.astronauts.astronaut.dao;

import java.net.URI;
import java.util.Date;

/**
 * Created by end on 04.05.17.
 */

public class Notification {


    private String author;
    private Avatar authorAvatar;
    private int authorGroup;
    private Date date;
    private String body;
    private Enum.NotificationType notificationNotificationType;
    private boolean isRead;
    private URI url;
    //Variables below this comment need to be tested.
    //private Entry entry;

    public Notification(String author, Avatar authorAvatar, int authorGroup, Date date, String body, Enum.NotificationType notificationNotificationType, boolean isRead, URI url, Entry entry) {
        this.author = author;
        this.authorAvatar = authorAvatar;
        this.authorGroup = authorGroup;
        this.date = date;
        this.body = body;
        this.notificationNotificationType = notificationNotificationType;
        this.isRead = isRead;
        this.url = url;
    }
}
