/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.OrderDetailsDAO;
import com.ijse.wearit.model.OrderDetails;
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
public class OrderDetailsDAOImpl implements OrderDetailsDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(OrderDetails t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(OrderDetails t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        OrderDetails search = (OrderDetails)sessionFactory.getCurrentSession().load(OrderDetails.class, id);
        if(search != null){
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public OrderDetails search(Integer id) throws Exception {
        return (OrderDetails)sessionFactory.getCurrentSession().load(OrderDetails.class, id);
    }

    @Override
    public List<OrderDetails> getAll() throws Exception {
        List<OrderDetails> users = sessionFactory.getCurrentSession().createCriteria(OrderDetails.class).list();
        return users;
    }
    
}
