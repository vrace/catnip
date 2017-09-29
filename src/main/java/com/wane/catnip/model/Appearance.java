package com.wane.catnip.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

@JsonInclude(NON_EMPTY)
public class Appearance {
    private List<Image> banners;

    public Appearance(List<Image> banners) {
        this.banners = banners;
    }

    public List<Image> getBanners() {
        return banners;
    }
}
