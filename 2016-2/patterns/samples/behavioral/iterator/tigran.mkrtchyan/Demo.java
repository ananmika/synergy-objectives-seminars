import ierator.Iterator;
import list.LinkedList;
import list.List;

/**
 * Created by Tigran.Mkrtchyan on 9/26/2016.
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Iterator<Integer> iterator = list.getIterator();
        while (iterator.hasPrev()) {
            if (iterator.prev().equals(1)) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }
}
