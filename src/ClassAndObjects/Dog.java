package ClassAndObjects;

public class Dog {
    //attribute fields
    String breed;
    String name;
    String color;
    int age;

    public Dog(String name, String breed, String color, int age){
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    //ACTION
    public static void bark(){
        System.out.println("AW AW AW !");
    }



}
