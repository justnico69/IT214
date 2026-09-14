package CartSystem;

public class ShoppingCart {
    private int itemsCount;
    private double totalPrice;

    ShoppingCart(){
        this.itemsCount = 0;
        this.totalPrice = 0.0;
    }


//getters
    public int getItemsCount(){
        return itemsCount;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    //

    public void addItem(double itemPrice){
        if (itemPrice <= 0){
            System.out.println("Error. Invalid input");
            return;
        }
            itemsCount++;
            totalPrice += itemPrice;

    }

    public void removeItem(double itemPrice){
        itemsCount--;
        totalPrice -= itemPrice;
        System.out.println("Removed item worth: "+itemPrice);

    }

    public void removeAllItems(){
        System.out.println("Resetting Items...");
        itemsCount = 0;
        totalPrice = 0.0;
    }


}
