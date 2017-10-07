/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.SizeDAO;
import com.ijse.wearit.dto.SizeDTO;
import com.ijse.wearit.model.Size;
import com.ijse.wearit.service.custom.SizeService;
import java.util.ArrayList;
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
    private SizeDAO sizeDAOImpl;

    @Override
    public boolean add(SizeDTO t) throws Exception {
        Size size = new Size();
        size.setSizeEU(t.getSizeEU());
        size.setSizeUK(t.getSizeUK());
        size.setSizeUS(t.getSizeUS());
        return sizeDAOImpl.add(size);
    }

    @Override
    public boolean update(SizeDTO t) throws Exception {
        Size size=new Size();
        size.setSize(t.getSize());
        size.setSizeEU(t.getSizeEU());
        size.setSizeUK(t.getSizeUK());
        size.setSizeUS(t.getSizeUS());
        return sizeDAOImpl.update(size);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return sizeDAOImpl.delete(id);
    }

    @Override
    public SizeDTO search(Integer id) throws Exception {
        Size search = sizeDAOImpl.search(id);
        if(search!=null){
            SizeDTO sizeDTO = new SizeDTO();
            sizeDTO.setSizeID(search.getID());
            sizeDTO.setSize(search.getSize());
            sizeDTO.setSizeEU(search.getSizeEU());
            sizeDTO.setSizeUK(search.getSizeUK());
            sizeDTO.setSizeUS(search.getSizeUS());
            return sizeDTO;
        }else{
         return null;
        }
    }

    @Override
    public List<SizeDTO> getAll() throws Exception {
        List<Size> all = sizeDAOImpl.getAll();
        SizeDTO sizeDTO = new SizeDTO();
        List<SizeDTO> allSize=new ArrayList<SizeDTO>();
        for (Size size : all) {
            sizeDTO.setSizeID(size.getID());
            sizeDTO.setSize(size.getSize());
            sizeDTO.setSizeEU(size.getSizeEU());
            sizeDTO.setSizeUK(size.getSizeUK());
            sizeDTO.setSizeUS(size.getSizeUS());
            allSize.add(sizeDTO);
        }
        return allSize;
    }
    
}
