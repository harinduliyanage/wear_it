/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom;

import com.ijse.wearit.dao.SuperDAO;
import com.ijse.wearit.model.Item;


public interface ItemDAO extends SuperDAO<Item>{
    public Item getItemByDescription(String description)throws Exception;
    public boolean deleteItemByDescription(String description)throws Exception;
    
}
