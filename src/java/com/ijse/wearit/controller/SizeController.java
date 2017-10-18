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
        
        boolean result = false;
        Status status = new  Status();
        
        //Create Size
        Sizes size = new Sizes();
        size.setSizes(sizes);
        size.setSizeUS(sizeUS);
        size.setSizeUK(sizeUK);
        size.setSizeEU(sizeEU);
        
        try {
            Sizes searchedSize = sizeService.getSizeByName(sizes);
            if(searchedSize == null){
                result = sizeService.add(size);
                if(result){
                    status  = new Status(200, "Ok", "Added Successfully...");
                        return status;
                    }else{
                        status = new Status(500, "Internal Server Error", "Added Faild..");
                        return status;
                }
            }else{
                status = new Status(401,"bad request", "Size Alrady Exits"); 
                return status;
            }
        } catch (Exception ex) {
            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    @RequestMapping(value = "/getSizeByName" , method = RequestMethod.GET)
    public @ResponseBody Sizes getSizeByName(HttpServletRequest request, 
            @RequestParam("size") String sizes){
        
        Sizes searchedSize = null;
        try {
            searchedSize = sizeService.getSizeByName(sizes);
            return searchedSize;
        } catch (Exception ex) {
            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return searchedSize;
    }
    
    @RequestMapping(value = "/updateSize", method = RequestMethod.POST)
    public @ResponseBody Status updateSize(HttpServletRequest request,
            @RequestParam("size") String sizes,
            @RequestParam("sizeUK") String sizeUK,
            @RequestParam("sizeUS") String sizeUS,
            @RequestParam("sizeEU") String sizeEU){
        
        Status status = new Status();
        try {
            Sizes searchedSize = sizeService.getSizeByName(sizes);
            searchedSize.setSizes(sizes);
            searchedSize.setSizeUS(sizeUS);
            searchedSize.setSizeUK(sizeUK);
            searchedSize.setSizeEU(sizeEU);
            
            boolean result = sizeService.update(searchedSize);
            if(result){
                status  = new Status(200, "Ok", "Updated Successfully...");
                return status;
            }else{
                status = new Status(500, "Internal Server Error", "Updating Faild..");
                return status;
            }
        } catch (Exception ex) {
            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    @RequestMapping(value = "/deleteSize", method = RequestMethod.POST)
    public @ResponseBody Status deleteSize(HttpServletRequest request,
            @RequestParam("size") String sizes ){
        
        Status status = new Status();
        try {
            Sizes searchedSize = sizeService.getSizeByName(sizes);
            boolean result = sizeService.delete(searchedSize.getId());
            if(result){
                status  = new Status(200, "Ok", "Size : "+sizes+" deleted...");
                return status;
            }else{
                status = new Status(500, "Internal Server Error", "delete Faild..");
                return status;
            }
        } catch (Exception ex) {
            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
}
