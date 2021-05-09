package business.abstracts;

import entities.concretes.LoginVM;
import entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(int userId);
    User getById(int userId);
    User getByEmail(String email);
    List<User> getAll();
}
