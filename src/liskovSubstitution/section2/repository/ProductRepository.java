package liskovSubstitution.section2.repository;

import singleResponsibility.section1.Product;

public class ProductRepository extends BaseRepository<Product> {
    @Override
     protected Product create(Product entity) {
        return null;
    }

    @Override
    protected Product update(Product entity) {
        return null;
    }
}
