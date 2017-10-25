package com.wane.catnip.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

@JsonInclude(NON_EMPTY)
public class LoginKey {
    private String key;

    public LoginKey() {
    }

    public LoginKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
