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
        ShoppingCartDetails search = (ShoppingCartDetails)sessionFactory.getCurrentSession().get(ShoppingCartDetails.class, id);
        if(search != null){
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public ShoppingCartDetails search(Integer id) throws Exception {
        ShoppingCartDetails shoppingCartDetails = (ShoppingCartDetails)sessionFactory.getCurrentSession().get(ShoppingCartDetails.class, id);
        return shoppingCartDetails;
    }

    @Override
    public List<ShoppingCartDetails> getAll() throws Exception {
        List<ShoppingCartDetails> shoppingCartDetailses = sessionFactory.getCurrentSession().createCriteria(ShoppingCartDetails.class).list();
        return shoppingCartDetailses;
    }

    @Override
    public ShoppingCartDetails getByItemDetail(Integer id) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(ShoppingCartDetails.class);
        c2.add(Restrictions.eq("ITEMDETAILS_ID", id));
        c2.setMaxResults(1);
        ShoppingCartDetails z = (ShoppingCartDetails) c2.uniqueResult();
        return z;
    }

    @Override
    public ShoppingCartDetails getByOrderQty(Integer orderQty) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(ShoppingCartDetails.class);
        c2.add(Restrictions.eq("orderQty", orderQty));
        c2.setMaxResults(1);
        ShoppingCartDetails z = (ShoppingCartDetails) c2.uniqueResult();
        return z;
    }

}
