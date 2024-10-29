package interfaceSegregation.section1;

// Burada Garsonun ihtiyacı olmayan metodlarıda implemente etmesi durumu zorunlu bırakıldı
public class Waiter implements  CafeEmployee{
    @Override
    public void getOrder() {
        System.out.println("Sipraiş alındı");
    }

    @Override
    public void cookFood() {
       // Garson yemek pişirmez
        throw  new UnsupportedOperationException();
    }

    @Override
    public void makeCoffee() {
        // Garson kahve yapmaz
        throw new UnsupportedOperationException();

    }

    @Override
    public void cleanTables() {
        System.out.println("Masalar temizlendi");

    }

    @Override
    public void washDishes() {
    // Garson bulaşıkları yıkamaz
        throw  new UnsupportedOperationException();
    }

    @Override
    public void collectPayment() {
        System.out.println("Ödeme alındı");

    }
}

// Bu şekilde yapmak yerine sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturmalıyız.
// Section 2 de bunu yapacagız