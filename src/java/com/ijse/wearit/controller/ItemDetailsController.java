/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.service.custom.ItemDetailsService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ABC
 */
@Controller
public class ItemDetailsController {
    
    @Autowired
    ItemDetailsService itemDetailsService;
    
    @RequestMapping(value = "/getAllItemDetails" , method = RequestMethod.GET)
    public @ResponseBody List<ItemDetails>  getAllSizes(){ 
        try {
            List<ItemDetails> all = itemDetailsService.getAll();
            System.out.println("called................ get All");
            return all;
            
        } catch (Exception ex) {
            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
