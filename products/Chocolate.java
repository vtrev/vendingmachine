public class Chocolate extends Product{



    public Chocolate(String name,double price){
        super(name,price);
    }


    @Override
    public void updateStock(int count) throws SoftDrinksOutOfStockException{

        if((stockCount+count) < 0 ){
            throw new ChocolatesAllGoneException("Ooops! All Chocolates have been eaten :(");
        }
        stockCount = stockCount + count;

    }

}