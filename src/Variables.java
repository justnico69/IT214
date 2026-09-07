import java.util.Scanner;

public class Variables {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Age: ");
        int userAge = scanner.nextInt();

        if(userAge >= 18){
            System.out.println("You are eligible to Vote");
        } else{
            System.out.println("You are not Eligible to VOTE");
        }

    }
}
