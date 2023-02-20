package com.seisoul.seiSoulCompanyManagementSystem.service;

import com.seisoul.seiSoulCompanyManagementSystem.entity.User;

import java.io.IOException;
import java.util.List;

public interface UserService {
    public void insertUsers(List<User> users) throws IOException;
    public void deleteUsers() throws IOException;
    public void updateUser(User user) throws IOException;
    public void selectUser(User user) throws IOException;
}
