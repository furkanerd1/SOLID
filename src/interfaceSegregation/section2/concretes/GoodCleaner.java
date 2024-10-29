package interfaceSegregation.section2.concretes;

import interfaceSegregation.section2.abstracts.Cleaner;

public class GoodCleaner implements Cleaner {
    @Override
    public void cleanTables() {
        System.out.println("Temizlikçi : Masalar temizlendi");
    }

    @Override
    public void washDishes() {
        System.out.println("Temizlikçi : Bulaşıklar yıkandı");
    }

    @Override
    public String greeting() {
        return "Hoşgeldiniz !";
    }
}
