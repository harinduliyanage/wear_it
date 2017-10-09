/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.OrdersDAO;
import com.ijse.wearit.model.Orders;
import com.ijse.wearit.service.custom.OrdersService;
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
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersDAO ordersDAOImpl;
    
    @Override
    public boolean add(Orders t) throws Exception {
        return ordersDAOImpl.add(t);
    }

    @Override
    public boolean update(Orders t) throws Exception {
        return ordersDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return ordersDAOImpl.delete(id);
    }

    @Override
    public Orders search(Integer id) throws Exception {
        return ordersDAOImpl.search(id);
    }

    @Override
    public List<Orders> getAll() throws Exception {
        return ordersDAOImpl.getAll();
    }
    
}
