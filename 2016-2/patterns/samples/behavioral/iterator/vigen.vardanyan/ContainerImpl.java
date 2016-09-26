package iterator;

/**
 * Created by Vigen.Vardanyan on 9/27/2016.
 */
public class ContainerImpl implements Container {
    public String names[] = {"Rob" , "John" ,"Julie" , "Lora"};

    public Iterator getIterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator {

        int index;

        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
