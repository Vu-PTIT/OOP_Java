public class ElectronicProduct extends Product {
    public String imei;
    public int warrantyMonths;

    public ElectronicProduct(String name, double price, String imei, int warrantyMonths) {
        super(name, price);
        this.imei = imei;
        this.warrantyMonths = warrantyMonths;
    }
}
