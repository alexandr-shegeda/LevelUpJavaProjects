package test;

import java.io.Serializable;

/**
 * Created by java on 17.01.2017.
 */
public class Button extends Component implements Clickable, Accessible, Serializable {

    @Override
    public void print() {
        Clickable.super.print();
        Accessible.super.print();
    }
}
