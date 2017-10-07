/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.PaymentMethodDAO;
import com.ijse.wearit.model.PaymentMethod;
import com.ijse.wearit.service.custom.PaymentMethodService;
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
public class PaymentMethodServiceImpl implements PaymentMethodService{

    @Autowired
    private PaymentMethodDAO paymentMethodDAOImpl;
    
    @Override
    public boolean add(PaymentMethod t) throws Exception {
        return paymentMethodDAOImpl.add(t);
    }

    @Override
    public boolean update(PaymentMethod t) throws Exception {
        return paymentMethodDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return paymentMethodDAOImpl.delete(id);
    }

    @Override
    public PaymentMethod search(Integer id) throws Exception {
        return paymentMethodDAOImpl.search(id);
    }

    @Override
    public List<PaymentMethod> getAll() throws Exception {
        return paymentMethodDAOImpl.getAll();
    }
    
}
