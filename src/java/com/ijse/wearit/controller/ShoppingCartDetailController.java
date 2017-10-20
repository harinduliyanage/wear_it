/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.ShoppingCartDetails;
import com.ijse.wearit.model.Status;
import com.ijse.wearit.service.custom.ShoppingCartDetailsService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ABC
 */
@Controller
public class ShoppingCartDetailController {
    
    @Autowired
    ShoppingCartDetailsService cartDetailsService;
    
    @RequestMapping(value = "/getAllcartdetails" , method = RequestMethod.GET)
    public @ResponseBody List<ShoppingCartDetails>  getShoppingCartDetailsTest(){ 
        try {
            List<ShoppingCartDetails> all =cartDetailsService.getAll();
            System.out.println("called................ get All");
            return all;
            
        } catch (Exception ex) {
            Logger.getLogger(ShoppingCartDetailController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @RequestMapping(value = "", method = RequestMethod.POST)
    public @ResponseBody Status addShoppingCartDetail(
            @RequestParam("description")String description,
            @RequestParam("userName")String userName,
            @RequestParam("size")String size,
            @RequestParam("orderQty")int orderQty,
            @RequestParam("unitPrice")double unitPrice){
        
        Status status = new Status();
        boolean result = false;
        try {
            result = cartDetailsService.addShoppingCartDetail(description, userName, size, orderQty, unitPrice);
            if(result){
                status  = new Status(200, "Ok", "Added Successfully...");
                return status;
            }else{
                status = new Status(500, "Internal Server Error", "Added Faild..");
                return status;
            }
        } catch (Exception ex) {
            Logger.getLogger(ShoppingCartDetailController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
