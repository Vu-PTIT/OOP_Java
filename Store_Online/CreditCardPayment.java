public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expriyDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expriyDate = expiryDate;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng:");
        System.out.println("Chủ thẻ: " + cardHolderName + " | Số thẻ: " + cardNumber);
        System.out.println("Số tiền: " + amount + " VND");
        return true;
    }
}
