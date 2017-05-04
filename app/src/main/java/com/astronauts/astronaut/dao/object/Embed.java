package com.astronauts.astronaut.dao.object;

import java.net.URI;

/**
 * Created by end on 04.05.17.
 */

public class Embed {

    public enum embedType {image, video}

    private embedType type;
    private URI preview;
    private URI url;
    private String source;
    private boolean plus18;

    public embedType getType() {
        return type;
    }

    public void setType(embedType type) {
        this.type = type;
    }

    public URI getPreview() {
        return preview;
    }

    public void setPreview(URI preview) {
        this.preview = preview;
    }

    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isPlus18() {
        return plus18;
    }

    public void setPlus18(boolean plus18) {
        this.plus18 = plus18;
    }

    public Embed(embedType type, URI preview, URI url, String source, boolean plus18) {
        this.type = type;
        this.preview = preview;
        this.url = url;
        this.source = source;
        this.plus18 = plus18;
    }
}
