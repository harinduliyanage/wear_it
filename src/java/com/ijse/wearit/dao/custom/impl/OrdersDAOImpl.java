/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.OrdersDAO;
import com.ijse.wearit.model.Orders;
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
public class OrdersDAOImpl implements OrdersDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(Orders t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(Orders t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Orders search=(Orders)sessionFactory.getCurrentSession().load(Orders.class, id);
        if (search != null) {
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Orders search(Integer id) throws Exception {
        return (Orders)sessionFactory.getCurrentSession().load(Orders.class, id);
    }

    @Override
    public List<Orders> getAll() throws Exception {
        List<Orders> list = sessionFactory.getCurrentSession().createCriteria(Orders.class).list();
       return list;
    }
    
}
