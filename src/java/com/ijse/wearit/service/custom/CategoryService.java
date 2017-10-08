/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom;

import com.ijse.wearit.model.Category;
import com.ijse.wearit.service.SuperService;

/**
 *
 * @author Harindu.sul
 */
public interface CategoryService extends SuperService<Category>{
    public Category getCategoryByName(String name)throws Exception;
    
}
