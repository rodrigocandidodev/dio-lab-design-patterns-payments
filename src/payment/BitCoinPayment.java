package payment;

public class BitCoinPayment implements Payment {
    @Override
    public void executePayment(double amount) {
        System.out.println("Paying with Bitcoin...");
    }
}
