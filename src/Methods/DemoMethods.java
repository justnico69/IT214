package Methods;

import java.util.Scanner;

public class DemoMethods {

    public static void main(String[] args) {

        System.out.println("Welcome to USTP");
        System.out.println("hELLO name");

        System.out.println("Welcome to USTP");
        System.out.println("hELLO name");
        System.out.println("Welcome to USTP");
        System.out.println("hELLO name");


        String studentName1 = inputStudentName();
        welcomeStudent(studentName1);

        String studentName2 = inputStudentName();
        welcomeStudent(studentName2);
    }

    public static String inputStudentName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        return name;
    }
    public static void welcomeStudent(String name){
        System.out.println("Welcome to USTP!");
        System.out.println("Hello, " + name);
    }



}
