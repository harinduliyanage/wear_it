/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.dto.ItemDetailsDTO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.Status;
import com.ijse.wearit.service.custom.ItemService;
import java.lang.reflect.Type;
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
    
    @RequestMapping(value = "/getAllItems" , method = RequestMethod.GET)
    public @ResponseBody List<Item>  getAllItemss(){ 
        try {
            List<Item> all = itemService.getAll();
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
    
//        @RequestMapping(value = "/deleteItem", method = RequestMethod.POST)
//        public @ResponseBody Status deleteItem(@RequestParam("description") String description){
//            Status status=null;
//            String staticPath="C:\\Users\\Harindu.sul\\Documents\\Project\\wear_it\\build\\web\\";
//            try{
//                //you should use transacton delete 
//                //code here to search item by description
//                //then get Item have any item details and delete itemDetails
//                //then searchitem.getPath();
//                
//                String givenDeletedPath=staticPath+searchitem.getPath;//database eke thiyena path eka mekata concat karanna + operator eka use karanna me widihata
//    		File file = new File(givenDeletedPath);
//                if(file.delete()){
//                   // code here delete item object
//                   //System.out.println(file.getName() + " is deleted!");
//                   //return OK status
//                }else{
//                    System.out.println("Delete operation is failed.");
//                }
//
//
//            }catch(Exception e){
//                System.out.println(e);
//
//            }
//            return status;
//        }
        
    
        //create method getItemByDescription 
    
    
        //create method getItemDetailsList by item description
    
        @RequestMapping(value = "/addItemDetalsToItem", method = RequestMethod.POST)
        public @ResponseBody Status addItemDetailsToItem(
                @RequestParam("itemDetailsArray")String itemDetailsArray,
                @RequestParam("itemDescription") String description){
            System.out.println("called****************Gson");
            System.out.println(itemDetailsArray);
            Gson gson=new Gson();
            String yourJson = itemDetailsArray;
            Type listType = new TypeToken<List<ItemDetailsDTO>>(){}.getType();
            List<ItemDetailsDTO> itemDetailsList = gson.fromJson(yourJson, listType);
            for (ItemDetailsDTO itemDetailsDTO : itemDetailsList) {
                System.out.println(itemDetailsDTO.getItemDescription());
            }
            
            return new Status();
        }
}
