package core.concretes;

import business.abstracts.UserService;
import core.abstracts.ExternalAuthService;
import entities.concretes.LoginVM;
import entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService {
	
	private UserService userService;

    public GoogleAuthManagerAdapter(UserService userService) {
        super();
        this.userService=userService;
    }

    @Override
    public void register(String email) {

        if(userExists(email) == false) {
            userService.add(userService.getByEmail(email));
        }

        else {
            User user=userService.getByEmail(email);

            LoginVM loginVM=new LoginVM();
            loginVM.setEmail(user.getEmail());
            loginVM.setPassword(user.getPassword());

            login(loginVM);
        }
    }

    @Override
    public boolean userExists(String email) {

        if(userService.getByEmail(email) != null) {
            return true;
        }

        return false;
    }
    @Override
    public void login(LoginVM loginVM) {
        if(loginVM != null && loginVM.getPassword().equals(loginVM.getPassword())) {
            System.out.println("Başarıyla giriş yaptınız.");
        }
        else {
            System.out.println("Kullanıcı adı veya şifren yanlış.!");
        }
    }

}
