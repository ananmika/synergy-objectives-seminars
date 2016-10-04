package flyweightPattern.concreteFlyweight;

import flyweightPattern.flyweight.Shape;

/**
 * @author Arthur
 * @since 10/3/2016.
 */
public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") : drawing point");
    }
}
