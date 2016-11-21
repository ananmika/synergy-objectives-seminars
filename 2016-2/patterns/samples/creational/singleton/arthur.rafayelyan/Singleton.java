package creational.singleton;

/**
 * @author Arthur Rafayelyan
 * @since 9/28/2016.
 */
public class Singleton {
    private static volatile Singleton uniqueInstance;
    private static Integer instanceCount = 0;

    private Singleton() {
        instanceCount++;
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public static Integer getInstanceCount() {
        return instanceCount;
    }
}
