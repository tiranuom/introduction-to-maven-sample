package com.hsenidmobile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BmiCalculator bmiCalculator = new BmiCalculator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("  Welcome to cse sample bmi calculator  ");
            System.out.println("Please enter the height");
            System.out.print(">>");
            String height = reader.readLine();

            System.out.println("Please enter the weight");
            System.out.print(">>");
            String weight = reader.readLine();
            float bmi = bmiCalculator.calculate(height, weight);

            System.out.printf("The calculated bmi is %.2f", bmi);
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidBmiPropertyException e) {
            e.printStackTrace();
        }
    }
}
