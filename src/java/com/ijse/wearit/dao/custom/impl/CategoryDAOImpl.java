/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom.impl;

import com.ijse.wearit.dao.custom.CategoryDAO;
import com.ijse.wearit.model.Category;
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
public class CategoryDAOImpl implements CategoryDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean add(Category t) throws Exception {
        Serializable save = sessionFactory.getCurrentSession().save(t); 
        return (save!=null);
    }

    @Override
    public boolean update(Category t) throws Exception {
        sessionFactory.getCurrentSession().update(t);
        return true;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        Category search = (Category)sessionFactory.getCurrentSession().load(Category.class , id);
        if(search != null){
            sessionFactory.getCurrentSession().delete(search);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Category search(Integer id) throws Exception {
        return (Category) sessionFactory.getCurrentSession().load(Category.class , id);
    }

    @Override
    public List<Category> getAll() throws Exception {
        List<Category> categorys = sessionFactory.getCurrentSession().createCriteria(Category.class).list();
        return categorys;
    }

    @Override
    public Category getCategoryByName(String name) throws Exception {
          String hql = "from Category where name = '" + name + "'";
      
        
        //Session session = sessionFactory.openSession();
        Query query = (Query)sessionFactory.getCurrentSession().createQuery(hql);
        List<Category> listCategory = query.list();
        
        for (Category s : listCategory) {
            if(s.getName().equalsIgnoreCase(name)){
                //session.close();
               return s;  
            }
        }
        //session.close();
        return null;
    }
    
}
