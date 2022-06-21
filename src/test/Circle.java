package test;


public class Circle extends Shape {
    private String figure;
    private int radius;
    private double Pi;

    @Override
    public double getMethods() {
        System.out.println("Figure : " + this.figure + " ,your area is " + this.area() + ", color : " + getColor());
        return  this.area();
    }



    @Override
    public double area() {
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
        System.out.println("Your radius is : " + this.radius);
        return this.radius;
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
