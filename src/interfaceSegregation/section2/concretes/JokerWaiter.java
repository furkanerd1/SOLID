package interfaceSegregation.section2.concretes;

import interfaceSegregation.section2.abstracts.Cleaner;
import interfaceSegregation.section2.abstracts.OrderTaker;

public class JokerWaiter implements OrderTaker, Cleaner {
    @Override
    public void cleanTables() {
        System.out.println("Joker garson : Masalar temizlendi");
    }

    @Override
    public void washDishes() {
        System.out.println("Joker garson : Bulaşıklar yıkandı");
    }

    @Override
    public void takeOrder() {
        System.out.println("Joker garson : Siparişler alındı");
    }

    @Override
    public void collectPayment() {
        System.out.println("Joker garson : Ödeme alındı");
    }

    @Override
    public String greeting() {
        return "Hoşgeldiniz !";
    }
}
