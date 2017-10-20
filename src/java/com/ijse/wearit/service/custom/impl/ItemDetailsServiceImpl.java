/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.ItemDAO;
import com.ijse.wearit.dao.custom.ItemDetailsDAO;
import com.ijse.wearit.dao.custom.SizeDAO;
import com.ijse.wearit.dto.ItemDetailsDTO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.service.custom.ItemDetailsService;
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
public class ItemDetailsServiceImpl implements ItemDetailsService{
    
    @Autowired
    private ItemDetailsDAO itemDetailsDAOImpl;
    
    @Autowired
    private ItemDAO itemDAOImpl;
    
    @Autowired
    private SizeDAO sizeDAOImpl;

    @Override
    public boolean add(ItemDetails t) throws Exception {
        return itemDetailsDAOImpl.add(t);
    }

    @Override
    public boolean update(ItemDetails t) throws Exception {
        return itemDetailsDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return itemDetailsDAOImpl.delete(id);
    }

    @Override
    public ItemDetails search(Integer id) throws Exception {
        return itemDetailsDAOImpl.search(id);
    }

    @Override
    public List<ItemDetails> getAll() throws Exception {
        return itemDetailsDAOImpl.getAll();
    }

    @Override
    public ItemDetails getItemDetailsBySizeAndItem(Sizes sizeByName, Item item) throws Exception {
        ItemDetails itemDetails = itemDetailsDAOImpl.getItemDetailsBySizeAndItem(sizeByName,item);
        return itemDetails;
    }

    @Override
    public List<ItemDetails> searchByItemID(Item item) {
        List<ItemDetails> itemDetailsList = itemDetailsDAOImpl.searchByItemID(item);
        return itemDetailsList;
    }

    @Override
    public boolean addItemDetailsToItem(String description,
            List<ItemDetailsDTO> itemdetailsList) throws Exception {
        boolean result = false;
        Item searchedItem = itemDAOImpl.getItemByDescription(description);
        for (ItemDetailsDTO itemDetailsDTO : itemdetailsList) {
            Item item = itemDAOImpl.getItemByDescription(itemDetailsDTO.getItemDescription());
            Sizes sizes = sizeDAOImpl.getSizeByName(itemDetailsDTO.getSizeName());
            ItemDetails itemDetails = new ItemDetails();
            itemDetails.setQtyOnHand(itemDetailsDTO.getQtyOnHand());
            itemDetails.setUnitPrice(itemDetailsDTO.getUnitPrice());
            itemDetails.setItem(item);
            itemDetails.setSizes(sizes);
            result = itemDetailsDAOImpl.add(itemDetails);
        }
        
        return result;
    }
    
    
}
