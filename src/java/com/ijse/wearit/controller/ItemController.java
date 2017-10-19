/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.dto.Arr;
import com.ijse.wearit.dto.ItemDetailsDTO;
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
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @RequestMapping(value = "/addNewItem", method = RequestMethod.POST)
    public @ResponseBody Status addNewItem(@RequestParam("file")MultipartFile file ,
            @RequestParam("name")String name,
            @RequestParam("description")String description,
            HttpServletRequest request) {
        
        String staticPath="resources\\images\\Item\\tempFile\\";
        String savedPath=staticPath+name;//Use to Item model path feeld... 
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    String path = context.getRealPath("/resources/images/Item") + File.separator +
                        "tempFile";
                    System.out.println(path);
                    File dir = new File(path);
                    if (!dir.exists()){
			dir.mkdirs();
                    }
                    File destinationFile = new File(dir.getAbsolutePath()+File.separator+name);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(destinationFile));
                    stream.write(bytes);
                    stream.close();
                    //Code here add to item database
                    //Use Item model path feeld to savedPath attribute... 
                   
                    
 
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        return new Status(200, "OK", "Upload succesfully..."); 
    
	}
    
        @RequestMapping(value = "/deleteItem", method = RequestMethod.POST)
        public @ResponseBody Status deleteItem(@RequestParam("description") String description){
            Status status=null;
            String staticPath="C:\\Users\\Harindu.sul\\Documents\\Project\\wear_it\\build\\web\\";
            try{
                //you should use transacton delete 
                //code here to search item by description
                //then get Item have any item details and delete itemDetails
                //then searchitem.getPath();
                
                String givenDeletedPath=staticPath+searchitem.getPath;//database eke thiyena path eka mekata concat karanna + operator eka use karanna me widihata
    		File file = new File(givenDeletedPath);
                if(file.delete()){
                   // code here delete item object
                   //System.out.println(file.getName() + " is deleted!");
                   //return OK status
                }else{
                    System.out.println("Delete operation is failed.");
                }


            }catch(Exception e){
                System.out.println(e);

            }
            return status;
        }
        
    
        //create method getItemByDescription 
    
    
        //create method getItemDetailsList by item description
        
    
}
