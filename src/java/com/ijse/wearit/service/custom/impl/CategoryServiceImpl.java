/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.CategoryDAO;
import com.ijse.wearit.dto.CategoryDTO;
import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.model.Category;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.service.ModelBuilder;
import com.ijse.wearit.service.custom.CategoryService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Harindu.sul
 */
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
    CategoryDAO categoryDAOImpl;
            

    @Override
    public boolean add(CategoryDTO t) throws Exception {
        Category category = ModelBuilder.buildCategory(t);
        return categoryDAOImpl.add(category);
    }

    @Override
    public boolean update(CategoryDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoryDTO search(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CategoryDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
