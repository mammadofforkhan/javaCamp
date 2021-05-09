package entities.concretes;

import entities.abstracts.ViewModels;

public class LoginVM  implements ViewModels {

    private String email;
    private String  password;

public LoginVM(){}

    public LoginVM(String email,String password) {
        super();
        this.email=email;
        this.password=password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
