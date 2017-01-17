package test;

import java.io.*;

/**
 * Created by java on 17.01.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("tmp.data")));


        out.writeObject(new Button());
    }
}
