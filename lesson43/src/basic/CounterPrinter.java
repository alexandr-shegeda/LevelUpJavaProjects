package basic;

/**
 * Created by java on 14.04.2017.
 */
public class CounterPrinter {

    public synchronized void print(String text) {
        for (int i = 0; i < 10; i ++) {
            System.out.println(text + " " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
