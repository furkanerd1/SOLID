package interfaceSegregation.section2;

import interfaceSegregation.section2.abstracts.Barista;
import interfaceSegregation.section2.abstracts.Chef;
import interfaceSegregation.section2.abstracts.Cleaner;
import interfaceSegregation.section2.abstracts.OrderTaker;
import interfaceSegregation.section2.concretes.*;

public class CafeDemo {
    public static void main(String[] args) {
        // Doğru yaklaşım kullanımı
        OrderTaker waiter = new Waiter();
        Chef chef = new GoodChef();
        Barista barista = new GoodBarista();
        Cleaner cleaner = new GoodCleaner();

        // Sipariş alma süreci
        String greeting =  waiter.greeting();
        System.out.println(greeting);
        waiter.takeOrder();
        chef.cookFood();
        barista.makeCoffee();
        cleaner.cleanTables();
        waiter.collectPayment();

        System.out.println("\nJoker Garson");
        JokerWaiter jokerWaiter = new JokerWaiter();
        String greeting2 = jokerWaiter.greeting();
        System.out.println(greeting2);
        jokerWaiter.takeOrder();
        jokerWaiter.cleanTables();
    }
}
