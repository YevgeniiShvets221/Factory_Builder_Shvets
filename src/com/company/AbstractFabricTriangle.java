package com.company;

public class AbstractFabricTriangle {
    public static IFigure create (double A, double B, double C, String type) {
        if (type.equals("Triangle")) {
            return FactoryTriangle.create(A, B, C);
        }
        return null;
    }
}