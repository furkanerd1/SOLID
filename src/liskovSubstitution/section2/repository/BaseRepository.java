package liskovSubstitution.section2.repository;

public abstract class  BaseRepository<T> {

   protected abstract T create(T entity);
   protected abstract T update(T entity);

    // Buradaki mantığımızda User entitymiz için emailine göre bulma  metodu eklmem gerekıyor fakat
    // bu metodu bu kısıma eklersem prensibin dışına çıkıyoruz çünkü
    // Alt sınıflar  üst sınıfların yerine geçebilmeli fakat metod(email e göre arama) sadece user entitysi için
    // olduğu için o metodu onun için özel olan repositoryde tanımlayacagız
}
