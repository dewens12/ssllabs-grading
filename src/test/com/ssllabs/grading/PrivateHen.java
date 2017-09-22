package com.ssllabs.grading;

import lombok.Getter;

public class PrivateHen {

    @Getter
    private int chickens;

    @Getter
    private boolean locked;

    public PrivateHen(int chickens) {
        this.chickens = chickens;
    }
}
