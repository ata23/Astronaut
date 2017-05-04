package com.astronauts.astronaut.dao;

import java.net.URI;

/**
 * Created by end on 04.05.17.
 */

public class Avatar {

    public enum avatarQuality{normal,medium,low}
    private URI normal,medium,low;
    private String owner;

    public void setAvatar(URI authorAvatar, avatarQuality quality) {
        switch (quality){
            case medium:
                this.medium=authorAvatar;
            case low:
                this.low=authorAvatar;
            default:
                this.normal=authorAvatar;
        }
    }

    public URI getAvatar(avatarQuality quality) {
        switch (quality){
            case medium:
                return medium;
            case low:
                return low;
            default:
                return normal;
        }
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public Avatar(URI low, URI medium, URI normal, String owner){
        setAvatar(low,avatarQuality.low);
        setAvatar(medium,avatarQuality.medium);
        setAvatar(normal,avatarQuality.normal);
        setOwner(owner);
    }

}
