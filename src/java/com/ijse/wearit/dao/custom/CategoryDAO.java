/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom;

import com.ijse.wearit.dao.SuperDAO;
import com.ijse.wearit.model.Category;

/**
 *
 * @author ABC
 */
public interface CategoryDAO extends SuperDAO<Category>{
    public Category getCategoryByName(String name)throws Exception;
}
