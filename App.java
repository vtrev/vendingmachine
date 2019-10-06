public class App{

public static void main(String[] args) {
    VendingMachine vendor = new VendingMachine();
    SoftDrink coke = new SoftDrink("Coke",20);
    Chocolate chomp = new Chocolate("chomp", 5);
    vendor.addStock(coke, 2);
    try {
        // vendor.buy(coke);
        vendor.buy(coke);
        vendor.buy(chomp);
    } catch (ProductNotFoundException | InvalidProductException e) { 
        e.printStackTrace();
    }
    
    
    }
    
}
