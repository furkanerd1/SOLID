package openClosed.section3;

// Kredi kartı ödemeleri için
public class CreditCardPayment implements Payment {

    private final double amount;
    private final String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    @Override
    public String processPayment() {
        return "Kredi kartı ile ödeme alındı "+amount+ " TL . Kredi kartı numarası : " + cardNumber.substring(cardNumber.length() - 4) + "******";
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
