/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service;

import com.ijse.wearit.dto.CategoryDTO;
import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.model.Category;
import com.ijse.wearit.model.Item;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Harindu.sul
 */
public class ModelBuilder {
    public static Category buildCategory(CategoryDTO dto){
        Category category = new Category();
        category.setName(dto.getName());
        
        Item i = new Item();
        Set<Item> items=new HashSet<Item>();
        Set<ItemDTO> itemsDTO = dto.getItemsDTO();
        for (ItemDTO itemDTO : itemsDTO) {
            i.setDescription(itemDTO.getDescription());
            i.setPath(itemDTO.getPath());
            i.setItemCode(itemDTO.getId());
        }
        return category;
    }
    
}
