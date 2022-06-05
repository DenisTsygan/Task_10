package com.example.task_10;


import static com.example.task_10.UtilityFormat.format_number;

public class RightPyramid extends EquilateralTriangle {
    private double apothem;

    public RightPyramid(double side, double apothem) {
        super(side);
        setApothem(apothem);

    }

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem > 0 ? apothem : 0;
    }

    public double getVolume() {
        return (super.getSquare() * this.apothem) / 3;
    }


    public double getSquarePyramid() {
        return super.getSquare() + (3 * super.getSide() * this.apothem) / 2;
    }

    @Override
    public String toString() {
        String result = super.getSide() != 0 && this.apothem != 0 ? "\nRightPyramid ({" + "volume=" + format_number(getVolume()) + "; square" + format_number(getSquare()) + "; apothem" + format_number(apothem) + "}"
                : "\nRightPyramid {side=" + getSide() + "; apothem=" + this.apothem + "(side or apothem=0)}";
        return result + super.toString() + ")";
    }
}
