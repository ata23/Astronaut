package com.astronauts.astronaut.dao;

import java.util.Date;

/**
 * Created by end on 05.05.17.
 */

public class ConversationList {

    private Date lastUpdate;
    private Avatar authorAvatar;
    private String authorSex;
    private Enum.MessageStatus messageStatus;

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Avatar getAuthorAvatar() {
        return authorAvatar;
    }

    public void setAuthorAvatar(Avatar authorAvatar) {
        this.authorAvatar = authorAvatar;
    }

    public String getAuthorSex() {
        return authorSex;
    }

    public void setAuthorSex(String authorSex) {
        this.authorSex = authorSex;
    }

    public Enum.MessageStatus getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Enum.MessageStatus messageStatus) {
        this.messageStatus = messageStatus;
    }

    public ConversationList(Date lastUpdate, Avatar authorAvatar, String authorSex, Enum.MessageStatus messageStatus) {
        this.lastUpdate = lastUpdate;
        this.authorAvatar = authorAvatar;
        this.authorSex = authorSex;
        this.messageStatus = messageStatus;
    }
}
