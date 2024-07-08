package payment;

import discount.DiscountStrategy;

public class ProcessorContext {
    private final Payment payment;
    private final DiscountStrategy discountStrategy;

    public ProcessorContext(Payment payment, DiscountStrategy discountStrategy) {
        this.payment = payment;
        this.discountStrategy = discountStrategy;
    }

    public void execute(double amount) {
        double discountedAmount = discountStrategy.applyDiscount(amount);
        payment.executePayment(discountedAmount);
    }
}
