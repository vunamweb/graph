package com.example.administrator.myapplication.models;

public class GraphPoint {
    int spanPos;
    int value;
    String text;

    float x, y;

    public GraphPoint(int spanPos, int value, String text) {
        this.spanPos = spanPos;
        this.value = value;
        this.text = text;
    }

    public int getSpanPos() {
        return spanPos;
    }

    public int getValue() {
        return value;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
