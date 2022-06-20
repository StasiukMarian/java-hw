package test;

import java.util.Objects;

public class Square extends Shape {
    private String figure;
    private double side;
    private double Side() {
        System.out.println("your side length is " + this.side);
        return this.side;
    }


    @Override
    public double Area() {
        return Math.pow(this.side,2);
    }

    @Override
    public double getMethods() {
        System.out.println("Figure : " + this.figure + " ,your area is " + this.Area() + ", color : " + getColor());
        return  this.Area();
    }

    public Square(String figure, double side) {
        this.figure = figure;
        this.side = side;
    }

    public Square(String color, String figure, double side) {
        super(color);
        this.figure = figure;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
