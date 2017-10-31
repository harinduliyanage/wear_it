/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.ShoppingCartDetails;
import com.ijse.wearit.model.Status;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.ShoppingCartDetailsService;
import com.ijse.wearit.service.custom.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShoppingCartDetailController {
    
    @Autowired
    ShoppingCartDetailsService cartDetailsService;
    
    @Autowired
    UserService userService;
    
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
    
    @RequestMapping(value = "/addShoppingCartDetailss", method = RequestMethod.POST)
    public @ResponseBody Status addShoppingCartDetailssTShoppingCart(
            @RequestParam("description")String description,
            @RequestParam("userName")String userName,
            @RequestParam("size")String size,
            @RequestParam("orderQty")int orderQty,
            @RequestParam("unitPrice")double unitPrice,
            HttpServletRequest request){
        
        Status status = new Status();
        boolean result = false;
        try {
            result = cartDetailsService.addShoppingCartDetailTShopin(description, userName, size, orderQty, unitPrice);
            HttpSession session = request.getSession();
            if(result){
                User user = userService.getUserByNam(userName);
                ShoppingCart shoppingCart = userService.getShoppingCartByUserId(user.getUserID());
                
                List<ShoppingCartDetails> shoppingCartDetails = cartDetailsService.getDetailsByCart(shoppingCart);
                session.setAttribute("shoppingCartDetails", shoppingCartDetails);
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
    
    @RequestMapping(value = "/deleteShoppingCartDetailsById")
    public @ResponseBody Status deleteShoppingCartDetail(@RequestParam("id") String id,HttpServletRequest request){
        
        Status status=new Status(500,"Internal Error","Deleted Fail");
        try {
            int shoppingCartDetailsId = Integer.parseInt(id);
            boolean delete = cartDetailsService.delete(shoppingCartDetailsId);
            HttpSession session = request.getSession();
            ArrayList<ShoppingCartDetails> sessionCart=(ArrayList<ShoppingCartDetails>) session.getAttribute("shoppingCartDetails");
            
            if (delete) {
                for (ShoppingCartDetails s : sessionCart) {
                    if(s.getId() == shoppingCartDetailsId){
                        sessionCart.remove(s);
                    }
                }
                session.setAttribute("shoppingCartDetails", sessionCart);
                status=new Status(200, "Ok", "deleted...");
            }
        } catch (Exception ex) {
            Logger.getLogger(ShoppingCartDetailController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
