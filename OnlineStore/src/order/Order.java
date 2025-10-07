import java.util.ArrayList;

public class Order {
    public String customerName;
    public ArrayList<Product> products;
    public String paymentType; 

    public Order(String customerName, String paymentType) {
        this.customerName = customerName;
        this.paymentType = paymentType;
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }

    public void checkout() {
        double total = calculateTotal();
        if (paymentType.equals("cash")) {
            System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + total + ". Thanh toán tiền mặt thành công.");
        } else if (paymentType.equals("card")) {
            System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + total + ". Thanh toán bằng thẻ tín dụng thành công.");
        } else if (paymentType.equals("momo")) {
            System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + total + ". Thanh toán qua Momo thành công.");
        } else {
            System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + total + ". Phương thức thanh toán không hợp lệ.");
        }
    }
}
