package Methods;

import java.util.Scanner;

public class Methods {

    public static String getUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String greetUser(){
        String name = getUserName();
        System.out.println("HELLO!!! "+name);
        return name;
    }

    public static void main(String[] args){
        greetUser();
    }
}