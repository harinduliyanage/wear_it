/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.dto.SizeDTO;
import com.ijse.wearit.service.custom.SizeService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Harindu.sul
 */
@Controller
public class SizeController {
    
    @Autowired
    SizeService sizeService;
    
    @RequestMapping(value = "/addNewSize")
    public String addNewSize(){
        SizeDTO sizeDTO = new SizeDTO();
        sizeDTO.setSizeEU("48");
        sizeDTO.setSizeUK("10");
        sizeDTO.setSizeUS("8");
        try {
            boolean add = sizeService.add(sizeDTO);
        } catch (Exception ex) {
            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error";
    }
    
    @RequestMapping(value = "/wish")
    public String getWishList(){ 
        return "wishlist";
    }
    
    @RequestMapping(value = "/cart")
    public String getCart(){ 
        return "ShoppingCart";
    }
    
}
