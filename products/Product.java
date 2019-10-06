abstract public class Product{

    private  String name;
    private  double price;
    protected int stockCount = 0;

    public Product(String name,double price){
        this.price = price;
        this.name = name;
    }

    public abstract void updateStock(int count) throws ProductNotFoundException;
    public int getStockCount(){
        return stockCount;
    }
    public String getName(){
        return name;
    }
}