package liskovSubstitution.section2.repository;

import liskovSubstitution.section1.entity.Category;

public class CategoryRepository extends BaseRepository<Category> {
    @Override
    protected Category create(Category entity) {
        return null;
    }

    @Override
    protected Category update(Category entity) {
        return null;
    }
}
