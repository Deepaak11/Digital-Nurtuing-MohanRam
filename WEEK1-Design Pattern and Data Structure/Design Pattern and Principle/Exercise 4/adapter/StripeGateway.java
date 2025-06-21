package adapter;

public class StripeGateway {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed via Stripe.");
    }
}
