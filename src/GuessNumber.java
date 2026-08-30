import java.util.Scanner;

public class GuessNumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
       int random = (int) (Math.random() * 6);

        System.out.println("Guess number: ");
       int guess = scanner.nextInt();

       if (guess == random) {

       }


    }
}
