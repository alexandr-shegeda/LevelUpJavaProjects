package basic;

/**
 * Created by java on 14.04.2017.
 */
public class CounterRunnable implements Runnable {

    private int initialValue;
    private int step;
    private int maxValue;
    private final CounterPrinter printer;

    public CounterRunnable(int initialValue, int step, int maxValue, CounterPrinter printer) {
        this.initialValue = initialValue;
        this.step = step;
        this.maxValue = maxValue;
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.print(Thread.currentThread().getName());
    }
}
