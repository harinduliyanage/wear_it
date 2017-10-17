/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.ShippingInfo;
import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.service.custom.ShippingInfoService;
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
public class ShippingInfoController {
    
    @Autowired
    ShippingInfoService shippingInfoService;
    
    @RequestMapping(value = "/getAllShippinginfo" , method = RequestMethod.GET)
    public @ResponseBody List<ShippingInfo>  getAllShippingInfo(){ 
        try {
            List<ShippingInfo> all = shippingInfoService.getAll();
            System.out.println("called................ get All");
            return all;
            
        } catch (Exception ex) {
            Logger.getLogger(ShippingInfoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
