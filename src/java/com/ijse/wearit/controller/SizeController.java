/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.model.Status;
import com.ijse.wearit.service.custom.SizeService;
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

/**
 *
 * @author Harindu.sul
 */
@Controller
public class SizeController {
    
    @Autowired
    SizeService sizeService;
    
    @RequestMapping(value = "/addNewSize",method = RequestMethod.POST)
    public @ResponseBody Status addNewSize12(HttpServletRequest request,
            @RequestParam("size") String sizes,
            @RequestParam("sizeUK") String sizeUK,
            @RequestParam("sizeUS") String sizeUS,
            @RequestParam("sizeEU") String sizeEU){
        //code here add size to database
           
        
    
        Status status = new Status(200, "ok", "added Successfull..");
        System.out.println("called...........//" +sizes+"////////"+sizeEU+"/////////////"+sizeUK+
                "///////////////"+sizeEU);
        return status;
    }
    
    @RequestMapping(value = "/admin")
    public String getWishList(){ 
        return "admin";
    }

    @RequestMapping(value = "/size")
    public String getSizeWindow(){ 
        return "addNewSize";
    }
    
    @RequestMapping(value = "/getAllSizes" , method = RequestMethod.GET)
    public @ResponseBody List<Sizes>  getAllSizes(){ 
        try {
            List<Sizes> all = sizeService.getAll();
            System.out.println("called................ get All");
            return all;
            
        } catch (Exception ex) {
            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
