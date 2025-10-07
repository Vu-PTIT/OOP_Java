public class Main {
    public static void main(String[] args) {
        // Tạo khách hàng
        Customer c1 = new Customer("C001", "Nguyễn Văn A", "vana@example.com");

        // Tạo sản phẩm
        Product p1 = new ElectronicProduct("E01", "Điện thoại Samsung", 15000000, "123456789012345", 24);
        Product p2 = new FoodProduct("F01", "Bánh quy Oreo", 35000, "12/12/2025");

        // Tạo đơn hàng
        Order order = new Order("O1001", c1);
        order.addProduct(p1);
        order.addProduct(p2);

        // Hiển thị đơn hàng trước khi thanh toán
        order.displayOrderInfo();

        // Chọn phương thức thanh toán
        PaymentMethod momo = new MomoPayment("0905123456", "MOMO123456");
        order.setPaymentMethod(momo);

        // Tiến hành thanh toán
        order.processPayment();

        // Hiển thị lại thông tin đơn hàng
        order.displayOrderInfo();
    }
}
