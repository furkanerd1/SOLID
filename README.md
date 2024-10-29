# SOLID Principles


**SOLID Nedir?**

- **SOLID** yazılım prensipleri; geliştirilen yazılımın esnek, yeniden kullanılabilir, sürdürülebilir ve anlaşılır olmasını sağlayan, kod tekrarını önleyen prensipler bütünüdür.
- Yazılımda sürdürülebilirliği desteklemek adına kullanılan prensiplerdir.
## S - Single Responsibility Principle (Tek Sorumluluk Prensibi)

- Bir sınıf sadece bir işi yapmalı ve değişmek için sadece bir nedeni olmalıdır
- Örnek: UserService sınıfı sadece kullanıcı işlemlerinden sorumlu olmalı, e-posta gönderme gibi farklı işlevler ayrı sınıflarda olmalıdır
- Bir sınıf (nesne) yalnızca bir amaç uğruna değiştirilebilir, o da o sınıfa yüklenen sorumluluktur, yani bir sınıfın(fonksiyona da indirgenebilir) yapması gereken yalnızca bir işi olması gerekir

## O - Open/Closed Principle (Açık/Kapalı Prensibi)

- Sınıflar gelişime açık, değişime kapalı olmalıdır
- Yeni özellikler eklemek için mevcut kodu değiştirmek yerine genişletebilmeliyiz
- Örnek: Yeni bir ödeme yöntemi eklerken PaymentProcessor sınıfını değiştirmek yerine, PaymentMethod interface'ini implement eden yeni bir sınıf oluşturmalıyız

## L - Liskov Substitution Principle (Liskov Yerine Geçme Prensibi)

- Alt sınıflar, üst sınıfların yerine kullanılabilmelidir
- Alt sınıflar üst sınıfların tüm özelliklerini koruyarak davranışlarını genişletmelidir


## I - Interface Segregation Principle (Arayüz Ayrımı Prensibi)

- Büyük arayüzler daha küçük ve spesifik arayüzlere bölünmelidir
- Sınıflar ihtiyaç duymadıkları metotları implement etmeye zorlanmamalıdır
- Örnek: Printer interface'i yerine Print, Scan, Fax gibi ayrı interface'ler kullanılmalıdır

## D - Dependency Inversion Principle (Bağımlılıkların Tersi Prensibi)

- Üst seviye modüller alt seviye modüllere bağımlı olmamalıdır
- Soyutlamalar detaylara değil, detaylar soyutlamalara bağımlı olmalıdır
- Örnek: NotificationService sınıfı EmailSender sınıfına değil, MessageSender interface'ine bağımlı olmalıdır

![1_lJ2ixDxnNFMJXLTgQ-XT0A](https://github.com/user-attachments/assets/03f73367-dbe5-4d93-b996-a785575f6008)
