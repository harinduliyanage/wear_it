/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.ItemDAO;
import com.ijse.wearit.model.Item;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ABC
 */
public class ItemDAOImpl implements ItemDAO{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean add(Item t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t); 
         return (save!=null);
    }

    @Override
    public boolean update(Item t) throws Exception {
       sessionFactory.getCurrentSession().update(t);
       return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Item search =(Item) sessionFactory.getCurrentSession().load(Item.class, id);
        if (search!=null) {
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Item search(Integer id) throws Exception {
        return (Item) sessionFactory.getCurrentSession().load(Item.class, id);
    }

    @Override
    public List<Item> getAll() throws Exception {
        List<Item> list=sessionFactory.getCurrentSession().createCriteria(Item.class).list();
        return list;
    }
    
}
