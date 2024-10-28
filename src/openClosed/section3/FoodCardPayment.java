package openClosed.section3;

// Eklediğimiz kısım
public class FoodCardPayment implements  Payment{

    private final double amount;
    private final String companyName;

    public FoodCardPayment(double amount, String companyName) {
        this.amount = amount;
        this.companyName = companyName;
    }

    @Override
    public String processPayment() {
        return "Yemek kartı ile ödeme yapıldı "+ amount + "TL . Şirket :" + companyName;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
