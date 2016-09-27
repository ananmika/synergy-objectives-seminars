package ierator;

/**
 * Created by Tigran.Mkrtchyan on 9/26/2016.
 */
public interface Iterator<T> {
    boolean hasPrev();
    T prev();
    void remove();
}
