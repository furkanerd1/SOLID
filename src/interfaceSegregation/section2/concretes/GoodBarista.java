package interfaceSegregation.section2.concretes;

import interfaceSegregation.section2.abstracts.Barista;

public class GoodBarista implements Barista {
    @Override
    public void makeCoffee() {
        System.out.println("Barista : Kahve yapıldı");
    }

    @Override
    public String greeting() {
        return "Hoşgeldiniz !";
    }
}
