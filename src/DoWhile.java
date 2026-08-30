import java.util.Scanner;

public class DoWhile {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pin;

        do{
            System.out.println("Input PIN: ");
            pin = scanner.nextInt();
        }while(pin != 1234);

    }
}
