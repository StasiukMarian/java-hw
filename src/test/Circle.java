package test;


public class Circle extends Shape {
    private String figure;
    private int radius;
    private double Pi;

    @Override
    public double getMethods() {
        System.out.println("Figure : " + this.figure + " ,your area is " + this.Area() + ", color : " + getColor());
        return  this.Area();
    }



    @Override
    public double Area() {
        return this.Pi*Math.pow(this.radius, 2) ;
    }

    public Circle() {
    }

    public Circle(String figure, int radius, double pi) {
        this.figure = figure;
        this.radius = radius;
        Pi = pi;
    }

    public Circle(String color, String figure, int radius, double pi) {
        super(color);
        this.figure = figure;
        this.radius = radius;
        Pi = pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPi() {
        return Pi;
    }

    public void setPi(double pi) {
        Pi = pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Pi=" + Pi +
                '}';
    }
}
