package openClosed.section1;

public class PaymentProcessor {

    //OpenClosed --> Yeni eklemelere açık fakat değişikliğe kapalı olmasını baz alan bir prensip.
    // Bu şekilde bir yapı oluşturduğumuzda farklı ödeme türleri eklendikçe
    // hem cleancode acısından spagetti kod oluşacak ve esnek bir yapı sağlamayacak
    public void processPayment(String paymentType, double amount) {

        if(paymentType.equals("Cash")) {
            System.out.println("nakit ödeme "+ amount);
        }else if(paymentType.equals("CreditCard")) {
            System.out.println("kredi kartı ödemesi "+amount);
        }
    }
}
