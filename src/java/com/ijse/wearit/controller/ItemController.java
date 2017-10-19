/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Status;
import com.ijse.wearit.service.custom.ItemDetailsService;
import com.ijse.wearit.service.custom.ItemService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author ABC
 */
@Controller
public class ItemController {
    
    @Autowired
    ItemService itemService;
    
    @Autowired
    ItemDetailsService itemDetailsService;
    
    @RequestMapping(value = "/getAllItems" , method = RequestMethod.GET)
    public @ResponseBody List<Item>  getAllItemss(){ 
        try {
            List<Item> all = itemService.getAll();
            System.out.println("called................ get All");
            return all;
            
        } catch (Exception ex) {
            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @RequestMapping(value = "/addNewItem", method = RequestMethod.POST)
    public @ResponseBody Status addNewItem(@RequestParam("file")MultipartFile file ,
            @RequestParam("fileName")String FileName,
            @RequestParam("description")String description,
            @RequestParam("category")String categoryName,
            HttpServletRequest request) throws Exception {
        
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setDescription(description);
            itemDTO.setFileName(FileName);
            itemDTO.setCategoryName(categoryName);
            itemDTO.setFile(file);

            Status status = new Status();
            boolean result = false;

            result=itemService.addItem(itemDTO);
            if(result){
                status  = new Status(200, "Ok", "Added Successfully...");
                return status;
            }else{
                status = new Status(500, "Internal Server Error", "Added Faild..");
                return status;
            }
	}
    
        @RequestMapping(value = "/deleteItem", method = RequestMethod.POST)
        public @ResponseBody Status deleteItem(@RequestParam("description") String description){
            Status status = new Status();
            boolean result = false;

            try {
                result=itemService.deleteItemByDescription(description);
                if(result){
                    status  = new Status(200, "Ok", "Deleted Successfully...");
                    return status;
                }else{
                    status = new Status(500, "Internal Server Error", "Deleted Faild..");
                    return status;
                }
            } catch (Exception ex) {
                Logger.getLogger(ItemController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return status;
        }
    
        @RequestMapping(value = "/getItemByDescription", method = RequestMethod.POST)
        public @ResponseBody Item getItemByDescription(
                @RequestParam("description") String description){
        
            Item item = null;
        try {
            item = itemService.getItemByDescription(description);
        } catch (Exception ex) {
            Logger.getLogger(ItemController.class.getName()).log(Level.SEVERE, null, ex);
        }
            return item;
        
        }
    
        @RequestMapping(value = "/getItemDetailsList", method = RequestMethod.GET)
        public @ResponseBody List<ItemDetails> getItemDetailsList(
                @RequestParam("description") String description){
            
            List<ItemDetails> itemDetailsList = null;
            try {
                Item searchedItem = itemService.getItemByDescription(description);
                itemDetailsList = itemDetailsService.searchByItemID(searchedItem.getItemCode());
            } catch (Exception ex) {
                Logger.getLogger(ItemController.class.getName()).log(Level.SEVERE, null, ex);
            }
            return itemDetailsList;
        }   
}
