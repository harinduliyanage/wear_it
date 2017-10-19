/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.Status;
import com.ijse.wearit.service.custom.ItemService;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
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
    ServletContext context;
    
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
    
    @RequestMapping(value = "/image", method = RequestMethod.POST)
    public @ResponseBody Status addNewItem(@RequestParam("file")MultipartFile file ,
            @RequestParam("name")String name,
            @RequestParam("description")String description,
            HttpServletRequest request) {
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    String path = context.getRealPath("/resources/images/Item") + File.separator +
                        "tempFile";
                    File dir = new File(path);
                    if (!dir.exists()){
			dir.mkdirs();
                    }
                    File destinationFile = new File(dir.getAbsolutePath()+File.separator+name);
                    String complexPath=dir.getAbsolutePath()+File.separator+name;
                    //
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(destinationFile));
                    stream.write(bytes);
                    stream.close();
                   
                    
 
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        return new Status(200, "OK", "Upload succesfully..."); 
    
	}
    
}
