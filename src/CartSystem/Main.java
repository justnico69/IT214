package CartSystem;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(700); //mouse
        cart.addItem(1000); //keyboard


        System.out.println("=====================");
        System.out.println("You currently have "+ cart.getItemsCount() +" items in your Cart");
        System.out.println("Total Price : " + cart.getTotalPrice());

        cart.removeAllItems();

        System.out.println("Items are now "+ cart.getItemsCount());
        System.out.println("Total price is now "+ cart.getTotalPrice());


    }
}
