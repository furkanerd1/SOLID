package singleResponsibility.section3.validations;

import singleResponsibility.section3.Product;

public class ValidationTool {

    public static void validate(Product product){
        if (product.getCategory().isEmpty()) {
            throw new NullPointerException("Category is empty");
        }else if(product.getPrice() <= 0) {
            throw new NullPointerException("Price cannot be less than zero");
        } else if (product.getName().isBlank()) {
           throw new NullPointerException("Name is empty");
        }
    }
}
