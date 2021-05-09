package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.statics.Utils;
import entities.concretes.LoginVM;
import entities.concretes.User;

public class AuthManager implements AuthService {

    private UserService userService;

    public AuthManager(UserService userService) {
        super();
        this.userService = userService;
    }

    @Override
    public void register(User user) {
        if(Utils.nameValidate(user.getName())
                && Utils.passwordValidate(user.getPassword())
                && !userExists(user.getEmail())
                && Utils.EmailValidate(user.getEmail()))
        {
            userService.add(user);
        }
        else {
            System.out.println("Kayit basarisiz!");
        }
    }

    @Override
    public void verify(User user, String token) {
        if(user != null && token.length() > 15) {
            User existUser= userService.getByEmail(user.getEmail());
            existUser.setVerify(true);

            userService.update(existUser);

            System.out.println("Email dogrulandi.");
        }
        else {
            System.out.println("Email dogrulanmadi.");
        }
    }

    @Override
    public boolean userExists(String email) {
        User user=userService.getByEmail(email);

        if(user == null) {
            return false;
        }

        else {
            System.out.println("Email zaten mevcut!" + email);
            return true;
        }
    }

    public void login(LoginVM loginVM) {

    }




}