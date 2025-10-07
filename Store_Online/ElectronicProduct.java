public class ElectronicProduct extends Product {
    private String imei;
    private int warrantyPeriod; // tháng

    public ElectronicProduct(String id, String name, double price, String imei, int warrantyPeriod) {
        super(id, name, price, "Điện tử");
        this.imei = imei;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sản phẩm điện tử: " + name + 
                           " | Giá: " + price + 
                           " | IMEI: " + imei + 
                           " | Bảo hành: " + warrantyPeriod + " tháng");
    }
}

