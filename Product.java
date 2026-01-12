public class Product {
    String name;
    double price = 0;
    int quantity =0;

    void addStock(int amount){
        if (amount > 0){
            quantity += amount;
            System.out.print("Add"+ amount + "items to stock" );
        }
    }
    void sell(int amount){
        if (amount <= quantity)
        {
         System.out.println("Sold " + amount + " items");

         quantity -= amount;
        }
        else {
            System.out.print("\nNot enough items in stock…");
        }
    }
    void changePrice(double newPrice){
        if(newPrice > 0){
            price = newPrice;
            System.out.print("Change price to" + newPrice + "baht");
        }
    }
    double stockValue(){
        return price * quantity;
    }
    void showInfo(){
        System.out.println("Name  : "+ name +
                         "\nPrice : " + price + " Baht/Item" +
                         "\nStock : " + quantity + " Items" +
                         "\nStock Value : " +stockValue() + " Baht");
    }
}
