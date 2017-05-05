package com.astronauts.astronaut.dao.object;

import java.util.Date;

/**
 * Created by end on 05.05.17.
 */

public class ConversationList {

    enum Status {unread, read}

    private Date lastUpdate;
    private Avatar authorAvatar;
    private String authorSex;
    private Status status;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ConversationList(Date lastUpdate, Avatar authorAvatar, String authorSex, Status status) {
        this.lastUpdate = lastUpdate;
        this.authorAvatar = authorAvatar;
        this.authorSex = authorSex;
        this.status = status;
    }
}
