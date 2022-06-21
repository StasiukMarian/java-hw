package test;


public class Trapeze extends Shape{
    private String figure;
    private double sideA;
    private double sideB;
    private double height;

    @Override
    public double area() {
        return ((this.sideA+this.sideB)/2)*this.height ;
    }

    @Override
    public double getMethods() {
        if (this.sideA <= this.sideB ){
            System.out.println("You can't draw this figure");
        }else{
            System.out.println("Figure : " + this.figure + " ,your area is " + this.area() + ", color : " + getColor());
        }
        return  this.area();
    }

    public Trapeze() {
    }


    public Trapeze(String figure, double sideA, double sideB, double height) {
        this.figure = figure;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public Trapeze(String color, String figure, double sideA, double sideB, double height) {
        super(color);
        this.figure = figure;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        System.out.println("Your height is : " + this.height);
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "figure='" + figure + '\'' +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", height=" + height +
                '}';
    }
}
