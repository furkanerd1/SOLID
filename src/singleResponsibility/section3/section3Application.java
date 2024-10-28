package singleResponsibility.section3;

import singleResponsibility.section3.Product;


public class section3Application {

    static ProductService productService;

    public static void main(String[] args){
        Product product1 = new Product(1,55000, "Iphone 15", "Phone");
        Product product2 = new Product(2, 1400, "JBL Tune 570bt", "Headphone");
        Product product3 = new Product(3, 60000, "Asus Tuf", "Computer");

        productService.add(product1);
        productService.add(product2);
        productService.add(product3);

        for(Product product : productService.getAll()){
            System.out.println(product.toString());
        }
    }
}
