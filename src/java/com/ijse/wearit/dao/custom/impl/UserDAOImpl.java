/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.UserDAO;
import com.ijse.wearit.model.User;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ABC
 */
@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public boolean add(User t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(User t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        User search = (User)sessionFactory.getCurrentSession().load(User.class, id);
        if(search != null){
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public User search(Integer id) throws Exception {
        return (User)sessionFactory.getCurrentSession().load(User.class, id);
    }

    @Override
    public List<User> getAll() throws Exception {
        List<User> users = sessionFactory.getCurrentSession().createCriteria(User.class).list();
        return users;
    }
    
}
