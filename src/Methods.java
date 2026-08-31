import java.util.Scanner;

public class Methods {

//    public static int addNumbers (int number1, int number2){
//        return number1 + number2;
//    }

    static String userName(String name){
        greetUser(name);
        System.out.println(name);
        return name;
    }

    static String greetUser(String greetName){
        System.out.println("Hello!!! "+greetName);
        return greetName;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        userName(name);

//        int sum = addNumbers(1,2);
//        System.out.println(sum);
    }
}