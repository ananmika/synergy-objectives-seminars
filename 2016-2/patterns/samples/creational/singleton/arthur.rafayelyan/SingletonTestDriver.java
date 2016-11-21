package creational.singleton;

import org.junit.Test;

/**
 * @author Arthur Rafayelyan
 * @since 9/28/2016.
 */
public class SingletonTestDriver {

    @Test
    public void testSingletonPattern() throws InterruptedException {
        final int SIZE = 1000;
        Thread[] thread = new Thread[SIZE];

        for (int i = 0 ; i < SIZE; i++){
            thread[i] = new Thread(new R());
            thread[i].start();
        }
        for (int i = 0 ; i < SIZE; i++){
            thread[i].join();
        }

        /**
         * We create a thread 1000 times
         * But we create only one object of Singleton class
         *
         * */
        assert Singleton.getInstanceCount().equals(1);
    }

    private class R implements Runnable {
        @Override
        public void run() {
            Singleton.getInstance();
        }
    }
}
