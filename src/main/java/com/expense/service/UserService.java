package com.expense.service;

import com.expense.entity.User;
import com.expense.entity.UserModel;

public interface UserService {

    User createUser(UserModel user);

    User readUser();

    User updateUser(UserModel user);

    void deleteUser();

    User getLoggedInUser();
}
