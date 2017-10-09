/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.SizeDAO;
import com.ijse.wearit.model.Size;
import com.ijse.wearit.service.custom.SizeService;
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
public class SizeServiceImpl implements SizeService{
    
    @Autowired
    SizeDAO sizeDAOImpl;

    @Override
    public boolean add(Size t) throws Exception {
        return sizeDAOImpl.add(t);
    }

    @Override
    public boolean update(Size t) throws Exception {
        return sizeDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return sizeDAOImpl.delete(id);
    }

    @Override
    public Size search(Integer id) throws Exception {
        return sizeDAOImpl.search(id);
    }

    @Override
    public List<Size> getAll() throws Exception {
        return sizeDAOImpl.getAll();
    }

    @Override
    public Size getSizeByName(String size) throws Exception {
        return sizeDAOImpl.getSizeByName(size);
    }
    
}
