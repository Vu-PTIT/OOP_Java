public class FoodProduct extends Product {
    public String expiryDate;

    public FoodProduct(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }
}
