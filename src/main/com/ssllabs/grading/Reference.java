package com.ssllabs.grading;

import lombok.Getter;
import lombok.Setter;

public class Reference {

    @Getter
    @Setter
    private String name;

    public Reference(String name) {
        this.name = name;
    }
}
