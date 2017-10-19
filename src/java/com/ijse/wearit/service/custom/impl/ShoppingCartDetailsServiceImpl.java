/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.ShoppingCartDetailsDAO;
import com.ijse.wearit.model.ShoppingCart;
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
    private ShoppingCartDetailsDAO shoppingCartDetailsDAOImpl;
    
    @Override
    public boolean add(ShoppingCartDetails t) throws Exception {
        return shoppingCartDetailsDAOImpl.add(t);
    }

    @Override
    public boolean update(ShoppingCartDetails t) throws Exception {
        return shoppingCartDetailsDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return shoppingCartDetailsDAOImpl.delete(id);
    }

    @Override
    public ShoppingCartDetails search(Integer id) throws Exception {
        return shoppingCartDetailsDAOImpl.search(id);
    }

    @Override
    public List<ShoppingCartDetails> getAll() throws Exception {
        return shoppingCartDetailsDAOImpl.getAll();
    }

    @Override
    public ShoppingCartDetails getByItemDetail(Integer id) throws Exception  {
        return shoppingCartDetailsDAOImpl.getByItemDetail(id);
    }

    @Override
    public List<ShoppingCartDetails> getDetailsByCart(ShoppingCart shoppingCart) throws Exception {
        List<ShoppingCartDetails> shoppingCartDetailses = shoppingCartDetailsDAOImpl.getDetailsByCart(shoppingCart);
        return shoppingCartDetailses;
    }

}
