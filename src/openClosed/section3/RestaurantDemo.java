package openClosed.section3;

public class RestaurantDemo {
    public static void main(String[] args) {

        OrderProcessor processor = new OrderProcessor();

        // Kurduğumuz yapı dolayısıyla farklı odeme sekıllerıye bu sekılde odeme yaptırabılırız
        // Ayrıca yeni bir ödeme yöntemi eklemek cok kolay olacaktır cunku ana yapımız belli
        // Bir sonraki sectionda yeni bir ödeme yöntemi ekleyeceğiz.

        Payment cashOrder = new CashPayment(150.50);
        Payment creditCardOrder = new CreditCardPayment(245.75, "1234567890123456");
        // Eklediğimiz kısım
        Payment foodCardOrder = new FoodCardPayment(200,"Sodexo");

        System.out.println("Nakit sipariş, :");
        processor.processOrder(cashOrder);

        System.out.println("\nKredi Kartı siparişi :");
        processor.processOrder(creditCardOrder);

        // Eklediğimiz kısım
        System.out.println("\nYemek kartı siparişi:");
        processor.processOrder(foodCardOrder);

    }
}