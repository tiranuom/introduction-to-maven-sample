package com.hsenidmobile;

/**
 * Created by tiran on 6/9/15.
 */
public class BmiCalculator {

    public float calculate(String height, String weight) throws InvalidBmiPropertyException {

        BmiProperty property = convertToBmiProperty(height, weight);

        return calculateBmiValue(property);
    }

    private BmiProperty convertToBmiProperty(String height, String weight) throws InvalidBmiPropertyException {
        try {
            return new BmiProperty(Float.parseFloat(height), Float.parseFloat(weight));
        } catch (NumberFormatException e) {
            throw new InvalidBmiPropertyException();
        }
    }

    private float calculateBmiValue(BmiProperty property) throws InvalidBmiPropertyException {
        if (!validate(property)) {
            throw new InvalidBmiPropertyException();
        }
        return (float) (property.getWeight() / Math.pow(property.getHeight(), 2));
    }

    private boolean validate(BmiProperty property) {
        return property.getHeight() > 0
                && property.getWeight() > 0;
    }

}
