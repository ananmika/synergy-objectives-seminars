package flyweightPattern.concreteFlyweight;

import flyweightPattern.flyweight.Shape;

/**
 * @author Arthur
 * @since 10/3/2016.
 */
public class Square implements Shape {

    private int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") : draw a square with a side " + a);
    }
}
