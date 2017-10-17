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
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
    
    static Integer uId = 0;
    
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
        User search = (User)sessionFactory.getCurrentSession().get(User.class, id);
        if(search != null){
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public User search(Integer id) throws Exception {
        return (User)sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public List<User> getAll() throws Exception {
        List<User> users = sessionFactory.getCurrentSession().createCriteria(User.class).list();
        return users;
    }

    @Override
    public User getUserByUserName(String userName) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(User.class);
        c2.add(Restrictions.eq("userName", userName));
        c2.setMaxResults(1);
        User z = (User) c2.uniqueResult();
        return z;
    }
    
}
