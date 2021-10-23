package pl.dobaczewskiMateusz.PurchaseRequests.user;

public interface UserService {

    User findByUsername(String name);

    void createUser(User user);
}
