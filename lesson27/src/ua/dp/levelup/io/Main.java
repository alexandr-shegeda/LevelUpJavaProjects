package ua.dp.levelup.io;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by java on 17.02.2017.
 */
public class Main {

    /* Input/OutputStream */

    public static void main(String[] args) throws IOException {
//        OutputStream out = new FileOutputStream("file.txt");
//
//        out.write("Hello World!\r\nIt's a miracle".getBytes());
//
//        out.close();

//        String fileName = "file.txt";
//        String fileName = "input.txt";
//        String fileData = readFromFile(fileName);
//        System.out.println(fileData);

//        writeToFile(fileData, "output.txt");

//        File file = new File("D:\\Java_16_6\\LevelUpProjects\\lesson27\\input.txt");
//        File file = new File("tmp/");
//
//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());

        List<Citizen> list = readCSV("citizen.csv");
        System.out.println(list);
    }

//    public static String readFromFile(String fileName) {
//        int data;
//        StringBuilder result = new StringBuilder();
//
//        try (InputStream input = new FileInputStream(fileName);) {
//            while ((data = input.read()) >= 0) result.append((char) data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return result.toString();
//    }
//
//    public static void writeToFile(String data, String fileName) {
//        try (Writer out = new FileWriter(fileName);) {
//            out.write(data.toUpperCase());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static List<Citizen> readCSV(String fileName) {
        List<Citizen> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String line;

            while ((line = reader.readLine()) != null) {
                if(line.startsWith("id")) continue;

                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(";");

                long id = scanner.nextLong();
                String fName = scanner.next();
                String lName = scanner.next();
                int age = scanner.nextInt();

                list.add(new Citizen(id, fName, lName, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return list;
    }

}
