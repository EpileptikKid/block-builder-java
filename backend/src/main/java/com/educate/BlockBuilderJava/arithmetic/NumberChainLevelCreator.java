package com.educate.BlockBuilderJava.arithmetic;

import java.util.List;

public interface NumberChainLevelCreator {
    List<ChainPoint> createLevel(int widthMonitor, int heightMonitor, int countElement);
}
