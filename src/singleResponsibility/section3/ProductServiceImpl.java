package singleResponsibility.section3;

import singleResponsibility.section3.validations.ValidationTool;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    List<Product> products = new ArrayList<Product>();
    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        ValidationTool.validate(product);
        products.add(product);
    }
}
