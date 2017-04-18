package basic;

import static basic.Main.inc;

/**
 * Created by java on 18.04.2017.
 */
public class MyIncThread extends Thread {

    @Override
    public void run() {
        inc();
    }
}