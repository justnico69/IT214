import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();

        System.out.println(" ======= ");
        System.out.println("1. Canned Tuna ");
        System.out.println("2. Corned Beef ");
        System.out.println("3. Water Bottle");
        System.out.println("4. Chips ");
        System.out.println("5. Biscuits");
        System.out.println("6. Toilet Paper");
        System.out.println("7. Handsoap");
        System.out.println("8. Display current List");
        System.out.println("9. Exit");
        System.out.println(" ======= ");

        int choice = 0;
        while(choice != 9){


            System.out.println(" Select an Item to be put into your List: ");
            choice = scanner.nextInt();

        switch (choice){
            case 1:
                items.add("Canned Tuna");
                System.out.println("You added Canned Tuna in your List");
                break;
            case 2:
                items.add("Corned Beef");
                System.out.println("You added Corned Beef in your List");
                break;
            case 3:
                items.add("Water Bottle");
                System.out.println("You added Water Bottle in your List");
                break;
            case 4:
                items.add("Chips");
                System.out.println("You added Chips in your List");
                break;
            case 5:
                items.add("Biscuits");
                System.out.println("You added Biscuits in your List");
                break;
            case 6:
                items.add("Toilet Paper");
                System.out.println("You added Toilet Paper in your List");
                break;
            case 7:
                items.add("Handsoap");
                System.out.println("You added Handsoap in your List");
                break;
            case 8:
                String listItems = String.join(", ", items);
                System.out.println("List: " + listItems);
                break;
            case 9:
                System.out.println("You are now exiting. Thank you");
                break;
            default:
                System.out.println("Invalid choice. Try again");
            }
        } scanner.close();
    }
}







