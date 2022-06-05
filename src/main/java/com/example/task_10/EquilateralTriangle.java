package com.example.task_10;


import static com.example.task_10.UtilityFormat.format_number;

public class EquilateralTriangle {
    private double side;

    public EquilateralTriangle(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side > 0 ? side : 0;
    }

    public double getHeight() {
        return (side * Math.sqrt(3)) / 2;
    }

    public double getBisector() {
        return (side * Math.sqrt(3)) / 2;
    }

    public double getPerimeter() {
        return side * 3;
    }

    public double getSquare() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {

        return this.side != 0 ? "EquilateralTriangle {" +
                "side=" + format_number(side) + "; height=" + format_number(getHeight()) + "; bisector="
                + format_number(getBisector()) + "; perimeter" + format_number(getPerimeter())
                + "; square=" + format_number(this.getSquare()) +
                '}' : "EquilateralTriangle { Side triangle=" + side + "}";
    }
}
