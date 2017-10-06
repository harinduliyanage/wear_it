/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.ShoppingCartDAO;
import com.ijse.wearit.model.ShoppingCart;
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
public class ShoppingCartDAOImpl implements ShoppingCartDAO{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean add(ShoppingCart t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(ShoppingCart t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        ShoppingCart search = (ShoppingCart)sessionFactory.getCurrentSession().load(ShoppingCart.class, id);
        if(search != null){
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public ShoppingCart search(Integer id) throws Exception {
        return (ShoppingCart)sessionFactory.getCurrentSession().load(ShoppingCart.class, id);
    }

    @Override
    public List<ShoppingCart> getAll() throws Exception {
        List<ShoppingCart> shoppingCarts = sessionFactory.getCurrentSession().createCriteria(ShoppingCart.class).list();
        return shoppingCarts;
    }
    
}
