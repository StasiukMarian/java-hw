package test;



public class Triangle extends Shape {
    private String figure;
    public int kathetos;

    @Override
    public double Area() {
        return 0;
    }
    public int Hypotenuse(){
    return (int) (Math.pow(this.kathetos, 2) + Math.pow(this.kathetos,2));
    }
    @Override
    public double getMethods() {
        System.out.println("Figure : " + this.figure + " ,your hypotenuse is " + this.Hypotenuse() + ", color : " + getColor());

        return  this.Area();
    }

    public Triangle(String figure, int kathetos) {
        this.figure = figure;
        this.kathetos = kathetos;
    }

    public Triangle(String color, String figure, int kathetos) {
        super(color);
        this.figure = figure;
        this.kathetos = kathetos;
    }

    public int getKathetos() {
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
