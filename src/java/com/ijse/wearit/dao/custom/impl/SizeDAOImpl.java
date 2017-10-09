/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.SizeDAO;
import com.ijse.wearit.model.Sizes;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
    public boolean add(Sizes t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t);
        return (save != null);
    }

    @Override
    public boolean update(Sizes t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Sizes size = (Sizes) sessionFactory.getCurrentSession().load(Sizes.class, id);
        if (size != null) {
            sessionFactory.getCurrentSession().delete(size);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Sizes search(Integer id) throws Exception {
        return (Sizes) sessionFactory.getCurrentSession().load(Sizes.class, id);
    }

    @Override
    public List<Sizes> getAll() throws Exception {
        List<Sizes> sizeList = sessionFactory.getCurrentSession().createCriteria(Sizes.class).list();
        return sizeList;
    }

    @Override
    public Sizes getSizeByName(String size) throws Exception {
        Criteria c2 = sessionFactory.getCurrentSession().createCriteria(Sizes.class);
        c2.add(Restrictions.le("sizes", size));
        c2.setMaxResults(1);
        Sizes z = (Sizes) c2.uniqueResult();
        return z;
    }
}
