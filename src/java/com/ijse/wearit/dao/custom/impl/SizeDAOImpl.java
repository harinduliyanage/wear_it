/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.SizeDAO;
import com.ijse.wearit.model.Size;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Harindu.sul
 */
@Repository
public class SizeDAOImpl implements SizeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(Size t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save != null);
    }

    @Override
    public boolean update(Size t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Size size = (Size) sessionFactory.getCurrentSession().load(Size.class, id);
        if (size != null) {
            sessionFactory.getCurrentSession().delete(size);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Size search(Integer id) throws Exception {
        return (Size) sessionFactory.getCurrentSession().load(Size.class, id);
    }

    @Override
    public List<Size> getAll() throws Exception {
        List<Size> sizeList = sessionFactory.getCurrentSession().createCriteria(Size.class).list();
        return sizeList;
    }

    @Override
    public Size getSizeByName(String size) throws Exception {
        String hql = "from Size where size = '" + size + "'";
      
        
        //Session session = sessionFactory.openSession();
        Query query = (Query)sessionFactory.getCurrentSession().createQuery(hql);
        List<Size> listSize = query.list();
        
        for (Size s : listSize) {
            if(s.getSize().equalsIgnoreCase(size)){
               //session.close();
                       
               return s;  
            }
        }
        //session.close();
              
        return null;
    }

}
