package liskovSubstitution.section2.repository;

import liskovSubstitution.section2.entity.User;

public class UserRepository extends BaseRepository<User> {
    @Override
    protected User create(User entity) {
        return null;
    }

    @Override
    protected User update(User entity) {
        return null;
    }

    // Burada tanımlayarak SOLID'e uyduk.
    public User findByEmail(String email) {
        return new User();
    }
}
