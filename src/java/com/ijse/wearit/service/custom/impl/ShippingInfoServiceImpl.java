/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.ShippingInfoDAO;
import com.ijse.wearit.model.ShippingInfo;
import com.ijse.wearit.service.custom.ShippingInfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ShippingInfoServiceImpl implements ShippingInfoService{
    
    @Autowired
    private ShippingInfoDAO shippingInfoDAOImpl;

    @Override
    public boolean add(ShippingInfo t) throws Exception {
        return shippingInfoDAOImpl.add(t);
    }

    @Override
    public boolean update(ShippingInfo t) throws Exception {
        return shippingInfoDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return shippingInfoDAOImpl.delete(id);
    }

    @Override
    public ShippingInfo search(Integer id) throws Exception {
        return shippingInfoDAOImpl.search(id);
    }

    @Override
    public List<ShippingInfo> getAll() throws Exception {
        return shippingInfoDAOImpl.getAll();
    }
    
}
