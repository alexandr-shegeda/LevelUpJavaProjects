package test;

/**
 * Created by java on 17.01.2017.
 */
interface Clickable{
    default void click(){
        System.out.println("click");
    }

    default void print(){
        System.out.println("Clickable");
    }
}