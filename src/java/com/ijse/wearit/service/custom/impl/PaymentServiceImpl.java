/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.PaymentDAO;
import com.ijse.wearit.model.Payment;
import com.ijse.wearit.service.custom.PaymentService;
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
public class PaymentServiceImpl implements PaymentService{
    
    @Autowired
    private PaymentDAO paymentDAOImpl;

    @Override
    public boolean add(Payment t) throws Exception {
        return paymentDAOImpl.add(t);
    }

    @Override
    public boolean update(Payment t) throws Exception {
        return paymentDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return paymentDAOImpl.delete(id);
    }

    @Override
    public Payment search(Integer id) throws Exception {
        return paymentDAOImpl.search(id);
    }

    @Override
    public List<Payment> getAll() throws Exception {
        return paymentDAOImpl.getAll();
    }
    
}
