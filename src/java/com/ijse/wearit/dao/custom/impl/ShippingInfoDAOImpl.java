/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.ShippingInfoDAO;
import com.ijse.wearit.model.ShippingInfo;
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
public class ShippingInfoDAOImpl implements ShippingInfoDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(ShippingInfo t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(ShippingInfo t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        ShippingInfo search=(ShippingInfo)sessionFactory.getCurrentSession().load(ShippingInfo.class, id);
        if (search != null) {
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public ShippingInfo search(Integer id) throws Exception {
        return (ShippingInfo)sessionFactory.getCurrentSession().load(ShippingInfo.class, id);
    }

    @Override
    public List<ShippingInfo> getAll() throws Exception {
        List<ShippingInfo> shippingInfos = sessionFactory.getCurrentSession().createCriteria(ShippingInfo.class).list();
        return shippingInfos;
    }
    
}
