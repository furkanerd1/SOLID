package singleResponsibility.section2;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    void add(Product product);
}
