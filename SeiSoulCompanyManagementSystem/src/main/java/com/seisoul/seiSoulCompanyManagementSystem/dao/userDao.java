package com.seisoul.seiSoulCompanyManagementSystem.dao;

import com.seisoul.seiSoulCompanyManagementSystem.entity.User;

import java.io.IOException;
import java.util.List;

public interface userDao {
    public void insertUsers(List<User> users) throws IOException;
    public void deleteUser(String id) throws IOException;
    public void updateUser(User user) throws IOException;
    public void selectUser(User user) throws IOException;
}
