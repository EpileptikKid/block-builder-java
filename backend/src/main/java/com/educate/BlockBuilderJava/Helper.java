package com.educate.BlockBuilderJava;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Helper {
    public static List<Integer> getIntegerSet(int count, int range) {
        Set<Integer> result = new HashSet<>();
        while (result.size() < count) {
            result.add((int) (Math.random()*range));
        }
        return result.stream().toList();
    }
}
