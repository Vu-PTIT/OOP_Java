package payment;

import order.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    public void pay(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + amount + ". Thanh toán bằng thẻ tín dụng thành công.");
    }
}
