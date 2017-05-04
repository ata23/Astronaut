package com.astronauts.astronaut.dao;

import java.net.URI;

/**
 * Created by end on 04.05.17.
 */

public class Dig {

    private String author;
    private Avatar authorAvatar;
    private URI authorGroup;


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

    public Dig(String author, Avatar authorAvatar, URI authorGroup) {
        setAuthor(author);
        setAuthorAvatar(authorAvatar);
        setAuthorGroup(authorGroup);
    }
}
