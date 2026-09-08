package ClassAndObjects;

public class Person {
    String name; // Class variable

    Person(String name) {
        // Java is confused! It thinks you are setting the parameter to itself.
        name = name;
    }
}
