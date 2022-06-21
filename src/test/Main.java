package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Square square = new Square("pink","square",  5);
        Circle circle = new Circle("blue","circle",  2,3.14);
        Trapeze trapeze = new Trapeze("white", "trapeze" , 3,2,2);
        Triangle triangle = new Triangle("brown","triangle",2);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(square);
        shapeList.add(circle);
        shapeList.add(trapeze);
        shapeList.add(triangle);
        for (Shape shape : shapeList) {
            shape.getMethods();
        }
    }

}
