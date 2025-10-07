package payment;

import order.PaymentMethod;

public class MomoPayment implements PaymentMethod {
    public void pay(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName + ". Tổng tiền: " + amount + ". Thanh toán qua Momo thành công.");
    }
}
