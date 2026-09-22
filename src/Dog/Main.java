package Dog;

public class Main {
    static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.setName("Junjun");
        myDog.setBreed("Aspin");
        myDog.setAge(30);

        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        System.out.println(myDog.getBreed());


//        myDog.name = "Borloloy";
//        myDog.breed = "Aspin";
//        myDog.age = 5;
//
//        myDog.age = 67;
//
//        System.out.println(myDog.name);
//        System.out.println(myDog.age);
//        System.out.println(myDog.breed);

    }
}
