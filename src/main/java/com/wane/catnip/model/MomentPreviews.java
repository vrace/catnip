package com.wane.catnip.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

@JsonInclude(NON_EMPTY)
public class MomentPreviews {
    private List<MomentPreview> moments;

    public MomentPreviews(List<MomentPreview> moments) {
        this.moments = moments;
    }

    public List<MomentPreview> getMoments() {
        return moments;
    }
}
