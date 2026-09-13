package Encapsulation;

public class Main {
    static void main(String[] args) {


        Dog myDog = new Dog("Junjun","Aspin","Male",5);

        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());

        myDog.setAge(6);

      System.out.println("TODAY IS JUNJUN'S BDAY, HE IS NOW " + myDog.getAge() + " years old");




//        System.out.println(myDog.name);
//        System.out.println(myDog.breed);
//        System.out.println(myDog.gender);
//        System.out.println(myDog.age);
    }

}
