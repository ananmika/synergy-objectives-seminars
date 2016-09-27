package list;

import ierator.*;

/**
 * Created by Tigran.Mkrtchyan on 9/26/2016.
 */
public interface List<T> extends ierator.Iterable<T>{
    void add(T value);
    T get();
}
