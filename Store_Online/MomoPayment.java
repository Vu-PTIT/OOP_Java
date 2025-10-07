public class MomoPayment implements PaymentMethod {
    private String phoneNumber;
    private String transactionId;

    public MomoPayment(String phoneNumber, String transactionId) {
        this.phoneNumber = phoneNumber;
        this.transactionId = transactionId;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Thanh toán qua Momo:");
        System.out.println("Số điện thoại: " + phoneNumber + " | Mã giao dịch: " + transactionId);
        System.out.println("Số tiền: " + amount + " VND");
        return true;
    }
}
