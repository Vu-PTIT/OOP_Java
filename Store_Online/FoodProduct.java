public class FoodProduct extends Product {
    private String expiryDate;

    public FoodProduct(String id, String name, double price, String expiryDate) {
        super(id, name, price, "Thực phẩm");
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sản phẩm thực phẩm: " + name +
                           " | Giá: " + price + 
                           " | Hạn sử dụng: " + expiryDate);
    }
}
