/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.ShoppingCartDetailsDAO;
import com.ijse.wearit.model.ShoppingCartDetails;
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
public class ShoppingCartDetailsDAOImpl implements ShoppingCartDetailsDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(ShoppingCartDetails t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(ShoppingCartDetails t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        ShoppingCartDetails search = (ShoppingCartDetails)sessionFactory.getCurrentSession().load(ShoppingCartDetails.class, id);
        if(search != null){
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public ShoppingCartDetails search(Integer id) throws Exception {
        return (ShoppingCartDetails)sessionFactory.getCurrentSession().load(ShoppingCartDetails.class, id);
    }

    @Override
    public List<ShoppingCartDetails> getAll() throws Exception {
        List<ShoppingCartDetails> shoppingCartDetailses = sessionFactory.getCurrentSession().createCriteria(ShoppingCartDetails.class).list();
        return shoppingCartDetailses;
    }
    
}
