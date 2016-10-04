package flyweightPattern;

import flyweightPattern.concreteFlyweight.Circle;
import flyweightPattern.flyweight.Shape;
import flyweightPattern.flyweightFactory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Arthur
 * @since 10/3/2016.
 */
public class FlyweightTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("square"));

        Random random = new Random();
        for (Shape shape : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x,y);
        }
    }

    @Test
    public void testCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();
        for(int  i = 0; i < 1000; i++) {
            shapes.add(shapeFactory.getShape("circle"));
        }
        Random random = new Random();
        for (Shape shape : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x,y);
        }
        Assert.assertEquals(new Circle().getInstanceCount(),2);
    }
}
