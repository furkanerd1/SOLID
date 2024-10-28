package openClosed.section3;

public class CashPayment implements Payment {

    private final double amount;

    public CashPayment(double amount) {

        this.amount = amount;
    }

    @Override
    public String processPayment() {

        return "Nakit ödeme gerçekleşti "+ amount +" TL";
    }

    @Override
    public double getAmount() {

        return amount;
    }
}
