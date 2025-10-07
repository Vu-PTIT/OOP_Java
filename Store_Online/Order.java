import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;
    private PaymentMethod paymentMethod;
    private boolean isPaid;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        double total = calculateTotal();
        System.out.println("Tổng tiền đơn hàng: " + total + " VND");
        if (paymentMethod != null) {
            isPaid = paymentMethod.pay(total);
            if (isPaid) {
                System.out.println("Thanh toán thành công!");
            } else {
                System.out.println("Thanh toán thất bại!");
            }
        } else {
            System.out.println("Chưa chọn phương thức thanh toán.");
        }
    }

    public void displayOrderInfo() {
        System.out.println("\n=== Thông tin Đơn hàng ===");
        customer.displayInfo();
        System.out.println("Danh sách sản phẩm:");
        for (Product p : products) {
            p.displayInfo();
        }
        System.out.println("Tổng tiền: " + calculateTotal() + " VND");
        System.out.println("Trạng thái: " + (isPaid ? "Đã thanh toán" : "Chưa thanh toán"));
    }
}
