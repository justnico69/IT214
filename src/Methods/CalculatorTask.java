package Methods;

import java.util.Scanner;

public class CalculatorTask {

    public static void main(String[] args) {

        // 1. The main asks for the first number and CATCHES it
        int firstNumber = inputNumber();

        // 2. The main asks for the second number and CATCHES it
        int secondNumber = inputNumber();

        // 3. The main hands BOTH numbers to the add method and CATCHES the sum
        int sum = add(firstNumber, secondNumber);
        System.out.println("Result of Addition: " + sum);

        // 4. The main hands BOTH numbers to the subtract method and CATCHES the difference
        int difference = subtract(firstNumber, secondNumber);
        System.out.println("Result of Subtraction: " + difference);
    }

    // METHOD 1: Handles user input (Reusable!)
    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        return num;
    }

    // METHOD 2: Handles addition
    public static int add(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    // METHOD 3: Handles subtraction
    public static int subtract(int num1, int num2) {
        int total = num1 - num2;
        return total;
    }
}