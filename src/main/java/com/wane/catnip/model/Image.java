package com.wane.catnip.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

@JsonInclude(NON_EMPTY)
public class Image {
    private String image;

    public Image(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
}
