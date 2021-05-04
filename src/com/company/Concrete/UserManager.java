package com.company.Concrete;

import com.company.Abstract.CheckIfPerson;
import com.company.Abstract.UserService;
import com.company.Entities.User;

public class UserManager implements UserService {
    private CheckIfPerson checkIfPerson;

    public UserManager(CheckIfPerson checkIfPerson) {
        this.checkIfPerson = checkIfPerson;
    }

    @Override
    public void add(User user) {
        if (checkIfPerson.checkPerson(user))
            System.out.println("Eklendi : " + user.getUserName());
        else
            System.out.println("Kullanıcı gerçek bir kullanıcı değil");
    }

    @Override
    public void update(User user) {
        System.out.println("Güncellendi : " + user.getUserName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Silindi : " + user.getUserName());
    }
}
