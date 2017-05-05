package com.astronauts.astronaut.dao;

import java.util.Date;

/**
 * Created by end on 05.05.17.
 */

public class PmMessage {


    private Avatar authorAvatar;
    private int authorGroup;
    private String authorSex;
    private Date date;
    private String body;
    private Enum.MessageStatus messageStatus;
    private Enum.MessageDirection messageDirection;

    public Avatar getAuthorAvatar() {
        return authorAvatar;
    }

    public void setAuthorAvatar(Avatar authorAvatar) {
        this.authorAvatar = authorAvatar;
    }

    public int getAuthorGroup() {
        return authorGroup;
    }

    public void setAuthorGroup(int authorGroup) {
        this.authorGroup = authorGroup;
    }

    public String getAuthorSex() {
        return authorSex;
    }

    public void setAuthorSex(String authorSex) {
        this.authorSex = authorSex;
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

    public Enum.MessageStatus getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Enum.MessageStatus messageStatus) {
        this.messageStatus = messageStatus;
    }

    public Enum.MessageDirection getMessageDirection() {
        return messageDirection;
    }

    public void setMessageDirection(Enum.MessageDirection messageDirection) {
        this.messageDirection = messageDirection;
    }

    public PmMessage(Avatar authorAvatar, int authorGroup, String authorSex, Date date, String body, Enum.MessageStatus messageStatus, Enum.MessageDirection messageDirection) {
        this.authorAvatar = authorAvatar;
        this.authorGroup = authorGroup;
        this.authorSex = authorSex;
        this.date = date;
        this.body = body;
        this.messageStatus = messageStatus;
        this.messageDirection = messageDirection;
    }
}
