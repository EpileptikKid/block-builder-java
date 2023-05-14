package com.educate.BlockBuilderJava.arithmetic;

import java.util.ArrayList;
import java.util.List;

public class SimpleLevelCreator implements NumberChainLevelCreator {
    @Override
    public List<ChainPoint> createLevel(int widthMonitor, int heightMonitor, int countElement) {
        List<ChainPoint> resultLevelPoints = new ArrayList<>();
        final int numberOfPlacesInWidth = widthMonitor/230 - 1;
        final int numberOfPlacesInHeight = heightMonitor/230 - 1;

        return null;
    }
}
