import discount.TenPercentDiscountStrategy;
import payment.CreditCardPayment;
import payment.ProcessorContext;

public class Main {
    public static void main(String[] args) {
        String flag = "Visa";
        double amount = 100d;

        ProcessorContext paymentProcessor = new ProcessorContext(
                new CreditCardPayment(flag),
                new TenPercentDiscountStrategy()
        );

        paymentProcessor.execute(amount);
    }
}