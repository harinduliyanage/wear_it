/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.ShoppingCartDAO;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.service.custom.ShoppingCartService;
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
public class ShoppingCartServiceImpl implements ShoppingCartService{
    
    @Autowired
    private ShoppingCartDAO shoppingCartDAOImpl;

    @Override
    public boolean add(ShoppingCart t) throws Exception {
        return shoppingCartDAOImpl.add(t);
    }

    @Override
    public boolean update(ShoppingCart t) throws Exception {
        return shoppingCartDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return shoppingCartDAOImpl.delete(id);
    }

    @Override
    public ShoppingCart search(Integer id) throws Exception {
        ShoppingCart shoppingCart = shoppingCartDAOImpl.search(id);
        return shoppingCart;
    }

    @Override
    public List<ShoppingCart> getAll() throws Exception {
        return shoppingCartDAOImpl.getAll();
    }
    
}
