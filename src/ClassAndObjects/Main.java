package ClassAndObjects;


public class Main {

    static void main(String[] args) {

    Dog myDog = new Dog("Borloloy", "Sigbin", "Rainbow", 67000);
    Dog yourDog = new Dog ("Junjun","Aspin","Black", 5);

//    myDog.name = "Junjun";
//    myDog.breed = "Aspin";
//    myDog.age = 5;
//    myDog.color = "Red";

    System.out.println(myDog.name);
        System.out.println(myDog.breed);
        System.out.println(myDog.age);
        System.out.println(myDog.color);
        System.out.println(" ");
        System.out.println(yourDog.name);
        System.out.println(yourDog.breed);
        System.out.println(yourDog.age);
        System.out.println(yourDog.color);


        myDog.bark();

    }
}
