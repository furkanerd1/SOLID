package openClosed.section3;

// Ödeme işlemleri için genel bir hedef oluşturacak arayüzümüz
public interface Payment {
    String processPayment();
    double getAmount();
}
