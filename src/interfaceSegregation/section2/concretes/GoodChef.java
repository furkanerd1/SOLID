package interfaceSegregation.section2.concretes;

import interfaceSegregation.section2.abstracts.Chef;

public class GoodChef implements Chef {
    @Override
    public void cookFood() {
        System.out.println("Aşçı : Yemekler yapıldı");
    }

    @Override
    public String greeting() {
        return "Hoşgeldiniz !";
    }
}
