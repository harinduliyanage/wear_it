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
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Harindu.sul
 */
@Repository
public class SizeDAOImpl implements SizeDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public boolean add(Size t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save!=null);
    }

    @Override
    public boolean update(Size t) throws Exception {
       sessionFactory.getCurrentSession().update(t);
       return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Size size=(Size)sessionFactory.getCurrentSession().load(Size.class, id);
        if (size!=null) {
            sessionFactory.getCurrentSession().delete(size);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Size search(Integer id) throws Exception {
        return (Size)sessionFactory.getCurrentSession().load(Size.class, id);
    }

    @Override
    public List<Size> getAll() throws Exception {
       List<Size> sizeList = sessionFactory.getCurrentSession().createCriteria(Size.class).list();
       return sizeList;
    }
    
}
