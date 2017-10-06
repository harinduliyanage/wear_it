/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.PaymentMethodDAO;
import com.ijse.wearit.model.PaymentMethod;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Harindu.sul
 */
@Repository
public class PaymentMethodDAOImpl implements PaymentMethodDAO{
    
    @Autowired
    SessionFactory sessionFactory;

     @Override
    public boolean add(PaymentMethod t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(PaymentMethod t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
      PaymentMethod search= (PaymentMethod)sessionFactory.getCurrentSession().load(PaymentMethod.class, id);
        if (search!=null) {
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public PaymentMethod search(Integer id) throws Exception {
        return (PaymentMethod)sessionFactory.getCurrentSession().load(PaymentMethod.class, id);
    }

    @Override
    public List<PaymentMethod> getAll() throws Exception {
        List<PaymentMethod> list = sessionFactory.getCurrentSession().createCriteria(PaymentMethod.class).list();
        return list;
    }
    
}
