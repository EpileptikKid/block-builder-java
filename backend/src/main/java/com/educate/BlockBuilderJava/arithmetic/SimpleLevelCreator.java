package com.educate.BlockBuilderJava.arithmetic;

import java.util.List;

public class SimpleLevelCreator implements LevelCreator {
    @Override
    public Level createLevels(int numberOfLevels) {
        Level resultLevel = new Level();
        resultLevel.setConditions("simple");
        List<ValuePoint> valuePoints = LevelUtils.generateValuePoints(5);
        return null;
    }
}
