package AbstractsAndInterfaces;

public class Main {

        public static void main(String[] args) {

            Dog dog = new Dog();
            System.out.println(dog.name = "Doggy");
            dog.makeNoise();
            dog.age = 5;
            dog.printAge();
            dog.swim();

            Cat cat = new Cat();
            System.out.println(cat.name = "Catto");
            cat.makeNoise();

            Duck duck = new Duck();
            System.out.println(duck.name = "ducky");
            duck.makeNoise();
            duck.fly();
            duck.swim();
        }
    }

