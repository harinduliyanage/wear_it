/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom;

import com.ijse.wearit.dao.SuperDAO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;
import java.util.List;

/**
 *
 * @author ABC
 */
public interface ItemDetailsDAO extends SuperDAO<ItemDetails>{
    public List<ItemDetails> searchByItemID(Integer itemId);
    public ItemDetails getItemDetailsBySizeAndItem(Sizes sizeByName, Item item)throws Exception;
}
