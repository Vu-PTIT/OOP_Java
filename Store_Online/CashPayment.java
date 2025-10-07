public class CashPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        System.out.println("Thanh toán bằng tiền mặt: " + amount + " VND");
        System.out.println("Khách hàng sẽ thanh toán khi nhận hàng.");
        return true;
    }
}
