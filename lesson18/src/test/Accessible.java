package test;

/**
 * Created by java on 17.01.2017.
 */
public interface Accessible {

    default void access(){
        System.out.println("access");
    }

    default void print(){
        System.out.println("Accessible");
    }

    default void show() {
        System.out.println("Show from Accessible");
    }
}