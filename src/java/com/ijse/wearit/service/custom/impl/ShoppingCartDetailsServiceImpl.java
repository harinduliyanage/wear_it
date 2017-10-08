/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.ShoppingCartDetailsDAO;
import com.ijse.wearit.model.ShoppingCartDetails;
import com.ijse.wearit.service.custom.ShoppingCartDetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ABC
 */
@Service
@Transactional
public class ShoppingCartDetailsServiceImpl implements ShoppingCartDetailsService{

    @Autowired
    private ShoppingCartDetailsDAO cartDetailsDAOImpl;
    
    @Override
    public boolean add(ShoppingCartDetails t) throws Exception {
        return cartDetailsDAOImpl.add(t);
    }

    @Override
    public boolean update(ShoppingCartDetails t) throws Exception {
        return cartDetailsDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return cartDetailsDAOImpl.delete(id);
    }

    @Override
    public ShoppingCartDetails search(Integer id) throws Exception {
        return cartDetailsDAOImpl.search(id);
    }

    @Override
    public List<ShoppingCartDetails> getAll() throws Exception {
        return cartDetailsDAOImpl.getAll();
    }
    
}
