package singleResponsibility.section3;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    void add(Product product);
}
