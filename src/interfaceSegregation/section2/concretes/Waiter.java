package interfaceSegregation.section2.concretes;

import interfaceSegregation.section2.abstracts.Cleaner;
import interfaceSegregation.section2.abstracts.OrderTaker;

public class Waiter implements OrderTaker {
    @Override
    public void takeOrder() {
        System.out.println("Garson : Siparişler alındı");
    }

    @Override
    public void collectPayment() {
        System.out.println("Garson : Ödeme alındı");
    }

    @Override
    public String greeting() {
        return "Hoşgeldiniz !";
    }
}
