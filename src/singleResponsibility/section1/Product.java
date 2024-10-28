package singleResponsibility.section1;

import java.util.List;

public class Product {

    private int id;
    private int price;
    private String name;
    private String category;

    public Product(int id, int price, String name, String category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    // Bu kısımdan sonra productın kendi sorumluluklarından cıkıp ek sorumluluk vermiş oluyoruz
    //  Bu da Sıngle Responsibility'e aykırı bir durum
    // Son iki metodumuz db işlemleri yapacak ayrı bir yapıya yazılmalı

    List<Product> getAll(){
        // db operations
        return null;
    }

    void add(Product product){
        // db operations
    }
}
