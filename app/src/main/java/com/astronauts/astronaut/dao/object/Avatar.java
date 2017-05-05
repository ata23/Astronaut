package com.astronauts.astronaut.dao.object;

import java.net.URI;

/**
 * Created by end on 04.05.17.
 */

public class Avatar {


    private URI normal, medium, low;
    private String owner;

    public void setAvatar(URI authorAvatar, Enum.AvatarQuality avatarQuality) {
        switch (avatarQuality) {
            case medium:
                this.medium = authorAvatar;
            case low:
                this.low = authorAvatar;
            default:
                this.normal = authorAvatar;
        }
    }

    public URI getAvatar(Enum.AvatarQuality avatarQuality) {
        switch (avatarQuality) {
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


    public Avatar(URI normal, URI medium, URI low, String owner) {
        this.normal = normal;
        this.medium = medium;
        this.low = low;
        this.owner = owner;
    }
}
