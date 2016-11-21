package structural.flyweight.concreteFlyweight;


import structural.flyweight.flyweight.Shape;

/**
 * @author Arthur
 * @since 10/3/2016.
 */
public class Circle implements Shape {
    int r = 5;
    static int instanceCount = 0;

    public Circle() {
        instanceCount++;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") : draw circle with a radius " + r);
        System.out.println("Circle class instance created : " + instanceCount);
    }

    public int getInstanceCount() {
        return instanceCount;
    }
}
