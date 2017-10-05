/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.SizeDAO;
import com.ijse.wearit.dao.custom.impl.SizeDAOImpl;
import com.ijse.wearit.dto.SizeDTO;
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
    private SizeDAO sizeDao;

    @Override
    public boolean add(SizeDTO t) throws Exception {
        Size size = new Size();
        size.setSizeEU(t.getSizeEU());
        size.setSizeUK(t.getSizeUK());
        size.setSizeUS(t.getSizeUS());
        return sizeDao.add(size);
    }

    @Override
    public boolean update(SizeDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SizeDTO search(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SizeDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
