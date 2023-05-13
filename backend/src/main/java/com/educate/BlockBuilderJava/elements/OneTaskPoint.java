package com.educate.BlockBuilderJava.elements;

import java.util.List;

public class OneTaskPoint {
    private List<Point> taskPoints;

    private List<Integer> correctOrder;

    public List<Point> getTaskPoints() {
        return taskPoints;
    }

    public void setTaskPoints(List<Point> taskPoints) {
        this.taskPoints = taskPoints;
    }

    public List<Integer> getCorrectOrder() {
        return correctOrder;
    }

    public void setCorrectOrder(List<Integer> correctOrder) {
        this.correctOrder = correctOrder;
    }
}
