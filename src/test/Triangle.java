package test;


public class Triangle extends Shape {
    private String figure;
    public double kathetos;

    @Override
    public double area() {
        return 0;
    }

    public double hypotenuse() {
            return (Math.pow(this.kathetos, 2) + Math.pow(this.kathetos, 2));
    }

    @Override
    public double getMethods() {
        if (this.hypotenuse() < 2) {
            System.out.println("You can't draw this figure");
        } else {
            System.out.println("Figure : " + this.figure + " ,your hypotenuse is " + this.hypotenuse() + ", color : " + getColor());

        }
        return this.area();
    }

    public Triangle(String figure, double kathetos) {
        this.figure = figure;
        this.kathetos = kathetos;
    }

    public Triangle(String color, String figure, double kathetos) {
        super(color);
        this.figure = figure;
        this.kathetos = kathetos;
    }

    public double getKathetos() {
        return kathetos;
    }

    public void setKathetos(int kathetos) {
        this.kathetos = kathetos;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "kathetos=" + kathetos +
                '}';
    }
}
