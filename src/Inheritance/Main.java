package Inheritance;

public class Main {
    static void main(String[] args) {

        Dog myDog = new Dog();
        Cat cat = new Cat();
        Chicken chick = new Chicken();

        System.out.println(cat.gender = "My Cat's gender is Female");
        myDog.eat();
        System.out.println(chick.name = "My Chicken's name is Coco");

        myDog.makeNoise();
        cat.makeNoise();
        chick.makeNoise();

    }
}
