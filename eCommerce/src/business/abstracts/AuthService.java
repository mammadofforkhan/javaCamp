package business.abstracts;
import entities.concretes.User;

public interface AuthService {
    void register(User user);
    void verify(User user, String token);
    boolean userExists(String email);
}
