package com.astronauts.astronaut.dao.object;

import java.util.Date;

/**
 * Created by end on 05.05.17.
 */

public class PmMessage {

    enum Status {unread, read}

    enum Direction {sended, received}

    private Avatar authorAvatar;
    private int authorGroup;
    private String authorSex;
    private Date date;
    private String body;
    private Status status;
    private Direction direction;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public PmMessage(Avatar authorAvatar, int authorGroup, String authorSex, Date date, String body, Status status, Direction direction) {
        this.authorAvatar = authorAvatar;
        this.authorGroup = authorGroup;
        this.authorSex = authorSex;
        this.date = date;
        this.body = body;
        this.status = status;
        this.direction = direction;
    }
}
