package com.company;

public class FactoryTriangle {
    public static Triangle create(double A, double B, double C) {

        if (A + B >= C && A + C >= B && B + C >= A) {
            return new Triangle(A, B, C);
        }
        return null;
    }
}
