/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom;

import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.service.SuperService;

/**
 *
 * @author Harindu.sul
 */
public interface ItemService extends SuperService<Item>{
    public boolean addItem(ItemDTO itemDTO)throws Exception;
    public Item getItemByDescription(String description)throws Exception;
    public boolean deleteItemByDescription(String description)throws Exception;
}
