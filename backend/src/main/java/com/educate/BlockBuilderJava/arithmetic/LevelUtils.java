package com.educate.BlockBuilderJava.arithmetic;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class LevelUtils {
    public static List<ValuePoint> generateValuePoints(int count) {
        List<ValuePoint> resultPoints = IntStream.rangeClosed(0, 99)
                .boxed()
                .map(element -> new ValuePoint(element))
                .collect(Collectors.toList());
        Collections.shuffle(resultPoints);
        return resultPoints.subList(0, count);
    }
}
