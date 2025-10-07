public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Nước ngọt", 5000000);
        Product p2 = new Product("kẹo quẩy", 20000);

        Order order1 = new Order("Lê Thị A", "cash");
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.checkout();

        Order order2 = new Order("Nguyễn Văn A", "card");
        order2.addProduct(p1);
        order2.checkout();

        Order order3 = new Order("Trần Văn C", "momo");
        order3.addProduct(p2);
        order3.checkout();
    }
}
