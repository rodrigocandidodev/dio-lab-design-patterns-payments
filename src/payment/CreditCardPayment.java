package payment;

public class CreditCardPayment implements Payment {
    private String flag;

    public CreditCardPayment(String flag) {
        this.flag = flag;
    }

    @Override
    public void executePayment(double amount) {
        System.out.println("Paying with " + flag + " CREDIT CARD");
    }
}
