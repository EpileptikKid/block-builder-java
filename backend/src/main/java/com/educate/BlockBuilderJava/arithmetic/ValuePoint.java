package com.educate.BlockBuilderJava.arithmetic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValuePoint {
    private int value;
    private boolean status;

    public ValuePoint(int value) {
        this.value = value;
    }
}
