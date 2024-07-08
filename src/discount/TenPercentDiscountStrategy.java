package discount;

public class TenPercentDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        double tenPercentDiscount = 0.1d;
        return amount * tenPercentDiscount;
    }
}
