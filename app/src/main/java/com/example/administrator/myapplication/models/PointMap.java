package com.example.administrator.myapplication.models;

import android.util.SparseIntArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PointMap {
    public int maxValue = 0;
    private HashMap<Integer, Integer> pointMap;
    private List<String> listText = new ArrayList<String>();

    public void addPoint(int spanPos, int value, String text) {
        if (maxValue < value) {
            maxValue = value;
        }
        pointMap.put(spanPos, value);
        listText.add(text);
    }

    public PointMap() {
        pointMap = new HashMap<Integer, Integer>();
    }

    public HashMap<Integer, Integer> getPointMap() {
        return pointMap;
    }

    public GraphPoint get(int spanPos) {
        if (pointMap.containsKey(spanPos)) {
            return new GraphPoint(spanPos, pointMap.get(spanPos), listText.get(spanPos - 1));
        } else {
            return new GraphPoint(spanPos, 0, null);
        }
    }
}