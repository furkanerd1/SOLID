package liskovSubstitution.section1.repository;

import liskovSubstitution.section1.entity.Category;
import liskovSubstitution.section1.entity.Product;


// Buradaki kodumuz genel olarak  SOLID in ilk üç prensibine uymuyor ve esnek değil
// Entity sayısı arttıkça if else blok sayısı artacak
//  Liskov  prensibine uymak için her entity için ayrı bir repository oluşturmalıyız fakat bu repositorylerde bir base repoya bağlı olmalı
// section 2 gibi
public class BaseRepository<T> {
    protected T create(T entity) {

        try {
            if (entity.getClass() == Category.class) {
                if (((Category) entity).getName().isEmpty()) {
                    throw new NullPointerException("Category name cannot be blank");
                }
                // Db Conn Logic
            } else if (entity.getClass() == Product.class) {
                if (((Product) entity).getPrice() <= 0) {
                    throw new Exception("Product price cannot be less then 0");
                } else if (((Product) entity).getDescription().length() < 100) {
                    throw new Exception("Product description length has to be grater than 100");
                }
                //Db Conn Logic
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return entity;
    }
}
