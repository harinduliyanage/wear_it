/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom;

import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.service.SuperService;

/**
 *
 * @author Harindu.sul
 */
public interface ItemDetailsService extends SuperService<ItemDetails>{
    public ItemDetails getItemDetailsBySizeAndItem(Sizes sizeByName, Item item)throws Exception;  
}
