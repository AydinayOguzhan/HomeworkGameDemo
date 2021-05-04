package com.company.Concrete;

import com.company.Abstract.CheckIfPerson;
import com.company.Entities.User;

public class CheckIfPersonManager implements CheckIfPerson {
    @Override
    public boolean checkPerson(User user) {
        if (user.getFirstName() != null && user.getLastName() != null && user.getNationalityId() != null && user.getDateOfBirth() != null)
            return true;
        else
            return false;
    }
}
