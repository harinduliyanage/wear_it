/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.PaymentDAO;
import com.ijse.wearit.model.Payment;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Harindu.sul
 */
public class PaymentDAOImpl implements PaymentDAO{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean add(Payment t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(Payment t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
      Payment search= (Payment)sessionFactory.getCurrentSession().load(Payment.class, id);
        if (search!=null) {
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Payment search(Integer id) throws Exception {
        return (Payment)sessionFactory.getCurrentSession().load(Payment.class, id);
    }

    @Override
    public List<Payment> getAll() throws Exception {
        List<Payment> list = sessionFactory.getCurrentSession().createCriteria(Payment.class).list();
        return list;
    }
    
}
