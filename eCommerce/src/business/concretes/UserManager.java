package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.abstracts.SendService;
import core.statics.Utils;
import dataAccess.abstracts.UserDao;
import entities.concretes.LoginVM;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;
    private SendService sendService;
    public UserManager(UserDao userDao, SendService sendService) {
        super();
        this.userDao = userDao;
        this.sendService = sendService;
    }

    @Override
    public void add(User user) {
        //if(userValidate(user)) {
        userDao.add(user);
        System.out.println("EKlendi: " + user.getEmail());
        sendService.send(user.getEmail(), "Kayıt oldunuz.");
        //}
    }

    @Override
    public void update(User user) {
        if(Utils.nameValidate(user.getName())) {
            userDao.update(user);
        }
    }

    @Override
    public void delete(int userId) {
        userDao.delete(userId);
    }

    @Override
    public User getById(int userId) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return userDao.getByEmail(email);
    }

    @Override
    public List<User> getAll() {
        for (User user : userDao.getAll()) {
            System.out.println(user.getId() +" "+ user.getEmail() +" "+ user.getFullName());
        }
        return userDao.getAll();
    }


}