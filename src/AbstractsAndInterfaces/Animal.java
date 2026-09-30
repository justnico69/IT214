package AbstractsAndInterfaces;

public abstract class Animal {

        String name;
        int age;

        public abstract void makeNoise();

        public void printAge(){
            System.out.println("This animal's age is: " + age);
        }

    }


