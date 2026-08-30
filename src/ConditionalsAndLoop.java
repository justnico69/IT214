import java.util.Scanner;

public class ConditionalsAndLoop {
    static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String userPass = "iloveustp";

        while (true) {
            System.out.println("Password: ");
            String enterPass = scanner.nextLine();
            if(!enterPass.equals(userPass)){
                System.out.println("Incorrect Password. Try again");
            }
            else{
                System.out.println("Successful Login!");
                break;
            }


        }

    }

}
