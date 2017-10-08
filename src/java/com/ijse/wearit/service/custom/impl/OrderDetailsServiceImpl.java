/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.OrderDetailsDAO;
import com.ijse.wearit.model.OrderDetails;
import com.ijse.wearit.service.custom.OrderDetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Harindu.sul
 */
@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService{

    @Autowired
    OrderDetailsDAO orderDetailsDAOImpl;
            
    @Override
    public boolean add(OrderDetails t) throws Exception {
        return orderDetailsDAOImpl.add(t);
    }

    @Override
    public boolean update(OrderDetails t) throws Exception {
        return orderDetailsDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return orderDetailsDAOImpl.delete(id);
    }

    @Override
    public OrderDetails search(Integer id) throws Exception {
        return orderDetailsDAOImpl.search(id);
    }

    @Override
    public List<OrderDetails> getAll() throws Exception {
        return orderDetailsDAOImpl.getAll();
    }
    
}
