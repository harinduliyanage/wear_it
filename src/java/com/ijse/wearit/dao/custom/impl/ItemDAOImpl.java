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
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ABC
 */
@Repository
public class ItemDAOImpl implements ItemDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

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

    @Override
    public Item getItemByDescription(String description) throws Exception {
        String hql = "from Item where description = '" + description + "'";
      
        
        //Session session = sessionFactory.openSession();
        Query query = (Query)sessionFactory.getCurrentSession().createQuery(hql);
        List<Item> listItem = query.list();
        
        for (Item i : listItem) {
            if(i.getDescription().equalsIgnoreCase(description)){
               
                //session.close();
               return i;  
            }
        }
        //session.close();
        return null;
    }
    
}
