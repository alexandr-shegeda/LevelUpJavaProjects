package ua.dp.levelup.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by java on 07.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Book book = new Book(14);
        book.setAuthor("Pushkin");
        book.setBookName("Book1");
        book.setPageCount(35);

        Class aClass = book.getClass();     //получение экземпляра класса

        Class bookClass = Book.class;       //получение экземпляра класса

        System.out.println("Book fields:");
        Field[] fields = bookClass.getFields();     //возвращает поля с публичным доступом
        for(Field field : fields) System.out.println(field.getName());

        System.out.println("Book declared fields:");
        Field[] declaredFields = bookClass.getDeclaredFields();     //возвращает все поля
        for(Field field : declaredFields) System.out.println(field.getName());

        Method[] methods = bookClass.getDeclaredMethods();      //возвращает все методы
        for (Method m : methods) System.out.println(m.getName());

        try {
            Field field = bookClass.getDeclaredField("author");

            field.set(book, "Gogol");

            String author = (String) field.get(book);       //получаем значение поля не используя геттеры

            System.out.println(author);


            Field fieldId = bookClass.getDeclaredField("id");

            fieldId.setAccessible(true);
            fieldId.set(book, 35L);

            System.out.println(fieldId.get(book));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        XMLParser parser = new XMLParser();
//        String bookAsXML = parser.toXML(book);
//        System.out.println(bookAsXML);

        Author author = new Author("John", "Doe", 44);


        long startToXML = System.currentTimeMillis();
        String authorAsXML = parser.toXML(author);
        System.out.println(authorAsXML + " time: " + (System.currentTimeMillis() - startToXML));

        long startFromXML = System.currentTimeMillis();
        Author fromXml = (Author) parser.parseXML(authorAsXML, Author.class);
        System.out.println(fromXml  + " time: " + (System.currentTimeMillis() - startFromXML));
    }



}
