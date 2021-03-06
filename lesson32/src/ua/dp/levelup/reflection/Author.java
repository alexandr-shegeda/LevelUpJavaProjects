package ua.dp.levelup.reflection;

/**
 * Created by java on 07.03.2017.
 */
public class Author {

    @ToXML
    private String firstName;
    @ToXML
    private String lastName;
    @ToXML
    private int age;

    public Author() {
    }

    public Author(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
