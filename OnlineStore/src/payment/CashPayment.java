package payment;

import order.PaymentMethod;

public class CashPayment implements PaymentMethod {
    public void pay(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + amount + ". Thanh toán tiền mặt thành công.");
    }
}
