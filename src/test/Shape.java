package test;


import java.util.Objects;

public abstract class Shape {
    private String color;

    public abstract double area ();
    public abstract double getMethods();
    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
