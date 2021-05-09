package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUsersDao implements UserDao {

    private List<User> users = new ArrayList<User>();
    public  HibernateUsersDao(){
        super();
        User Kenan = new User(1,"Kənan","Məmmədov","kanan@vox.az","0334parol",true);
        User Senan = new User(2,"Sənan","Məmmədov","sanan@vox.az","0334parol",true);
        User Terxan = new User(3,"Tərxan","Məmmədov","terxan@vox.az","0334parol",true);
        User Ferid = new User(4,"Fərid","İmanov","ferid@vox.az","0334parol",false);
        User Orxan = new User(5,"Orxan","Məmmədov","orxan@vox.az","0334parol",true);
        users.add(Kenan);users.add(Senan);users.add(Terxan);users.add(Ferid);users.add(Orxan);

    }
    @Override
    public void add(User user) {
        users.add(user);
        System.out.println(user.getFullName() +"Isimli Kullanici Eklendi");

    }

    @Override
    public void update(User user) {
User userUpdate = users.stream()
        .filter(u -> u.getId()==user.getId()).findFirst().orElse(null);
        userUpdate.setEmail(user.getEmail());
        userUpdate.setLastName(user.getLastName());
        userUpdate.setName(user.getName());
        userUpdate.setPassword(user.getPassword());
        userUpdate.setVerify(user.isVerify());
    }

    @Override
    public void delete(int userId) {
        User userDelete = users.stream()
                .filter(u -> u.getId() == userId)
                .findFirst()
                .orElse(null);
        users.remove(userDelete);
    }

    @Override
    public User getById(int userId) {
        User user = users.stream()
                .filter(u -> u.getId() == userId)
                .findFirst()
                .orElse(null);
        return user;
    }

    @Override
    public User getByEmail(String email) {
        User user = users.stream()
                .filter((u -> u.getEmail() == email))
                .findFirst()
                .orElse(null);
        return user;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
