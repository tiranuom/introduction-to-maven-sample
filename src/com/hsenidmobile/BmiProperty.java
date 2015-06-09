package com.hsenidmobile;

/**
 * Created by tiran on 6/9/15.
 */
public class BmiProperty {
    private float weight;
    private float height;

    public BmiProperty(float height, float weight) {
        this.weight = weight;
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }
}
