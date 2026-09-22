package DogEncapsulation;

public class Main {
    static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.setName("Junjun");
        myDog.setBreed("Askal");
        myDog.setAge(67);

        System.out.println(myDog.getName());
        System.out.println(myDog.getBreed());
        System.out.println(myDog.getAge());


//        myDog.name = "Borloy";
//        myDog.breed = "Aspin";
//        myDog.age = 5;
//        myDog.age = 67;
//
//        System.out.println(myDog.name);
//        System.out.println(myDog.age);
//        System.out.println(myDog.breed);

    }
}
