/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.ItemDAO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.service.custom.ItemService;
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
public class ItemServiceImpl  implements ItemService{
    
    @Autowired
    private ItemDAO itemDAOImpl;

    @Override
    public boolean add(Item t) throws Exception {
        return itemDAOImpl.add(t);
    }

    @Override
    public boolean update(Item t) throws Exception {
        return itemDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
       return itemDAOImpl.delete(id);
    }

    @Override
    public Item search(Integer id) throws Exception {
        return itemDAOImpl.search(id);
    }

    @Override
    public List<Item> getAll() throws Exception {
        return itemDAOImpl.getAll();
    }
    
}
