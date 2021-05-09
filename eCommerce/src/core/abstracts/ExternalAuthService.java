package core.abstracts;

import entities.concretes.LoginVM;

public interface ExternalAuthService {
    void register(String email);
    boolean userExists(String email);
    void login(LoginVM loginVM);
}
