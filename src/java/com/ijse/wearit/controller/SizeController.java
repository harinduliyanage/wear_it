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
    
    @RequestMapping(value = "/addNewSize",method = RequestMethod.POST,consumes = "*/*")
    public @ResponseBody Status addNewSize12(HttpServletRequest request,@RequestParam("sizes") String sizes){//methana param dala ne eka nisa call wenawa
//        Sizes size = new Sizes();
//        size.setSizeEU("40");
//        size.setSizeUK("8");
//        size.setSizeUS("6");
//        size.setSizes("XSXXX");
//        try {
//            boolean add = sizeService.add(size);
//        } catch (Exception ex) {
//            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);

//        }
            doSomething(request);
        
    
        Status status = new Status(200, "ok", "added Successfull..");
        System.out.println("called...........//" +request.getParameter("size"));
        return status;
    }
    
    public void doSomething(HttpServletRequest request) {
//        try {
//            String jsonBody;
//            // do stuff
//            //jsonBody = IOUtils.toString( request.getInputStream());
//        } catch (IOException ex) {
//            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
