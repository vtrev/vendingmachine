public class  SoftDrink extends Product{

    public SoftDrink(String name,double price){
        super(name,price);
    }


    @Override
    public void updateStock(int count) throws SoftDrinksOutOfStockException{

        if((stockCount+count) < 0 ){
            throw new SoftDrinksOutOfStockException("Ooops! No more drinks for you :( ");
        }
        stockCount = stockCount + count;

    }

}