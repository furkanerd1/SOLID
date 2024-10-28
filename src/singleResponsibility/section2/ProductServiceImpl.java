package singleResponsibility.section2;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {


    private static List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAll() {
        return products;
    }

    // Bu kısımda Single Responsibility prensibine aykırı olan durum :
    // Metodumuz ürünleri veritabanına eklemek uzerıne yapılandırılmıs bir metod olmasına rağmen
    // ek sorumluluk yuklenerek validation islemleri yapılmıs
    @Override
    public void add(Product product) {
        if (product.getCategory().isEmpty()) {
            throw new NullPointerException("Category is empty");
        }else if(product.getPrice() <= 0) {
            throw new NullPointerException("Price cannot be less than zero");
        }
        //db save
        products.add(product);
    }
}
