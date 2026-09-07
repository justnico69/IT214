package Methods;

import java.util.Scanner;

public class NewDemoMethods {

   public static void main(String[] args) {

       String studentName1 = inputName();
       String studentName2 = inputName();

       welcomeAndGreetStudent(studentName1);
       welcomeAndGreetStudent(studentName2);

   }

    public static String inputName(){
       Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static void welcomeAndGreetStudent(String name){
        System.out.println("WELCOME TO USTP");
        System.out.println("-------------------------");
        System.out.println("You're a Senior");
        System.out.println("Hello," + name);
    }
}
