package Methods;

import java.util.Scanner;

public class DemoMethods {

    public static void main(String[] args) {
        int studentScore = inputScore();

        int finalScore = addBonusPoints(studentScore);

        System.out.println("Your Final Score: "+ finalScore);

    }


    public static int addBonusPoints(int score){
        int bonus = 5;
        int total = score + bonus;
        return total;

    }

    public static int inputScore(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input score: ");
        int score = scanner.nextInt();
        return score;
    }

//    public static String inputStudentName(){
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        welcomeStudent(name);
//        return name;
//    }
//
//    public static void welcomeStudent(String name){
//        System.out.println("Welcome to USTP!");
//        System.out.println("Hello, " + name);
//    }

}
