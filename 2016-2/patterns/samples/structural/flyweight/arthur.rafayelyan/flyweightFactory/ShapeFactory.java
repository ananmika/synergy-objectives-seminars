package structural.flyweight.flyweightFactory;

import structural.flyweight.concreteFlyweight.Circle;
import structural.flyweight.concreteFlyweight.Point;
import structural.flyweight.concreteFlyweight.Square;
import structural.flyweight.flyweight.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arthur
 * @since 10/3/2016.
 */
public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            switch (shapeName) {
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "point":
                    shape = new Point();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}
