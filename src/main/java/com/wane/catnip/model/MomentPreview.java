package com.wane.catnip.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.joda.time.DateTime;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

@JsonInclude(NON_EMPTY)
public class MomentPreview {
    private String id;
    private String cat;
    private Image avatar;
    private DateTime timestamp;
    private String message;
    private List<Image> thumbs;

    public MomentPreview(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getCat() {
        return cat;
    }

    public Image getAvatar() {
        return avatar;
    }

    public DateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public List<Image> getThumbs() {
        return thumbs;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }

    public void setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setThumbs(List<Image> thumbs) {
        this.thumbs = thumbs;
    }
}
