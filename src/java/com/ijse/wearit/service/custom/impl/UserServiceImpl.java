/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.UserDAO;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ABC
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserDAO userDAOImpl;

    @Override
    public boolean add(User t) throws Exception {
        return userDAOImpl.add(t);
    }

    @Override
    public boolean update(User t) throws Exception {
        return userDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return userDAOImpl.delete(id);
    }

    @Override
    public User search(Integer id) throws Exception {
        return userDAOImpl.search(id);
    }

    @Override
    public List<User> getAll() throws Exception {
        return userDAOImpl.getAll();
    }

    @Override
    public User getUserByNam(String userName) throws Exception {
        return userDAOImpl.getUserByUserName(userName);
    }
    
}
