package adapter;

public class Main {
    public static void main(String[] args) {

        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(150.0);


        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(200.0);
    }
}
