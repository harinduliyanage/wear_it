/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.ItemDetailsDAO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ABC
 */
@Repository
public class ItemDetailsDAOImpl implements ItemDetailsDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public boolean add(ItemDetails t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(ItemDetails t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        ItemDetails itemDetails = (ItemDetails) session.load(ItemDetails.class, id);
	if(null != itemDetails){
            session.delete(itemDetails);
            return true;
        }else{
            return  false;
        }
    }

    @Override
    public ItemDetails search(Integer id) throws Exception {
        ItemDetails itemDetail = (ItemDetails) sessionFactory.getCurrentSession().load(ItemDetails.class, id);
        return itemDetail;
    }

    @Override
    public List<ItemDetails> getAll() throws Exception {
        List<ItemDetails> itemDetailsList = sessionFactory.getCurrentSession().createCriteria(ItemDetails.class).list();
        return  itemDetailsList;
    }

    @Override
    public List<ItemDetails> searchByItemID(Item item) {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(ItemDetails.class);
        c2.add(Restrictions.eq("item", item));
        List<ItemDetails> list = c2.list();
        return list;
    }

    @Override
    public ItemDetails getItemDetailsBySizeAndItem(Sizes sizeByName, Item item) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(ItemDetails.class);
        c2.add(Restrictions.eq("sizes", sizeByName));
        c2.add(Restrictions.eq("item", item));
        return (ItemDetails) c2.uniqueResult();
    }
    
}
