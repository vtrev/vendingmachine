public class SoftDrinksOutOfStockException extends ProductNotFoundException{
    public SoftDrinksOutOfStockException(String message){
        super(message);
    }

}