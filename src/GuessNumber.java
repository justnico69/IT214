import java.util.Scanner;

public class GuessNumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
       int random = (int) (Math.random() * 5) +1;


       while(true){
           System.out.println("Guess number: ");
           int guess = scanner.nextInt();

           //validation
           if(guess > 5 || guess < 1){
               System.out.println("Please input only between 1 and 5");
               continue;
           }

           if(guess == random){
               System.out.println("Wow Congrats on guessing correctly! The random number was " + random);
               break;
           } else{
               System.out.println("Try again!");
           }

       }

       scanner.close();



    }
}
