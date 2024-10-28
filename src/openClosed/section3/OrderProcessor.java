package openClosed.section3;

// Siparişleri yöneten sınıf
public class OrderProcessor {

    public void processOrder(Payment thePayment){
            if(thePayment.getAmount()<0){
               throw new IllegalArgumentException("Ödeme tutarı negatif olamaz");
            }

        System.out.println("Sipariş Hazırlanıyor...");

        String paymentResult = thePayment.processPayment();
        System.out.println(paymentResult);

        System.out.println("Sipariş tamamlandı");
    }

}
