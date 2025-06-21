package strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();


        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "kavi"));
        context.payAmount(250.0);


        context.setPaymentStrategy(new PayPalPayment("kavi@example.com"));
        context.payAmount(150.0);
    }
}
