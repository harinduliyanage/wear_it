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
public class ItemDAOImpl implements ItemDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(Item t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save != null);
    }

    @Override
    public boolean update(Item t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Item search = (Item) sessionFactory.getCurrentSession().load(Item.class, id);
        if (search != null) {
            sessionFactory.getCurrentSession().delete(search);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Item search(Integer id) throws Exception {
        return (Item) sessionFactory.getCurrentSession().load(Item.class, id);
    }

    @Override
    public List<Item> getAll() throws Exception {
        List<Item> list = sessionFactory.getCurrentSession().createCriteria(Item.class).list();
        return list;
    }

    @Override
    public Item getItemByDescription(String description) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(Item.class);
        c2.add(Restrictions.eq("description",description));
        c2.setMaxResults(1);
        Item i = (Item) c2.uniqueResult();
        return i;
    }

    @Override
    public boolean deleteItemByDescription(String description) throws Exception {
        Item search = (Item) sessionFactory.getCurrentSession().load(Item.class, description);
        if (search != null) {
            sessionFactory.getCurrentSession().delete(search);
            return true;
        } else {
            return false;
        }
    }
}
