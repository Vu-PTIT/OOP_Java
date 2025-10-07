package order;

public interface PaymentMethod {
    void pay(String customerName, double amount);
}
