package iterator;

/**
 * Created by Vigen.Vardanyan on 9/27/2016.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        ContainerImpl container = new ContainerImpl();

        for(Iterator iterator = container.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
