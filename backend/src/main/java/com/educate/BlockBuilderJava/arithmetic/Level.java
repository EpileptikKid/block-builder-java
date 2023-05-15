package com.educate.BlockBuilderJava.arithmetic;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Level {
    private List<ChainPoint> points;
    private String conditions;
}
