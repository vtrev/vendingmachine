public class InvalidProductException extends RuntimeException{
    private String product;
    
    public InvalidProductException(String product){
        this.product = product;
    }

    @Override
    public String getMessage(){
        return "Sorry, product "+ product + " is not available";
    }
    
}