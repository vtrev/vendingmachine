public class VendingMachine{


public void buy(Product p) throws ProductNotFoundException,InvalidProductException{
    if(p instanceof SoftDrink){
        p.updateStock(-1);
        return;
    }
    throw new InvalidProductException(p.getName());
    
    
    
}

public void addStock(Product p ,int stockCount){
    try{
        p.updateStock(+stockCount);
    }catch(ProductNotFoundException e){
        System.out.println("Invalid stock count : "+stockCount);
    }
    
}

public int getStock(Product p){
    return p.getStockCount();
}
}