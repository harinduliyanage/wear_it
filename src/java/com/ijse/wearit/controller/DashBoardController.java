/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.ShoppingCartDetails;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.ShoppingCartDetailsService;
import com.ijse.wearit.service.custom.UserService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashBoardController {
    
    @Autowired
    UserService userService;
    
    @Autowired
    ShoppingCartDetailsService shoppingCartDetailsService;
    
    @RequestMapping("/items")
    public String getItemView(){
        return "Items";
    }
    @RequestMapping("/contact")
    public String getContact(){
        return "contact";
    }
    @RequestMapping("/checkout")
    public String getCheckOut(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user=(User) session.getAttribute("currentUser");
        ShoppingCart shoppingCart;
        try {
            shoppingCart = userService.getShoppingCartByUserId(user.getUserID());
            List<ShoppingCartDetails> shoppingCartDetails = shoppingCartDetailsService.getDetailsByCart(shoppingCart);
            session.setAttribute("shoppingCartDetails", shoppingCartDetails);
        } catch (Exception ex) {
            Logger.getLogger(DashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "checkout";
    }
    @RequestMapping("/404")
    public String get404(){
        return "404";
    }
    @RequestMapping("/login")
    public String getLigin(){
        return "login";
    }
    @RequestMapping("/product")
    public String getProduct(){
        return "product";
    }
    @RequestMapping("/wishlist")
    public String getWishList(){
        return "wishlist";
    }
    @RequestMapping("/typo")
    public String getTypo(){
        return "typo";
    }
    @RequestMapping("/register")
    public String getRegister(){
        return "register";
    }
    
    @RequestMapping("/category")
    public String getCategoryManageView(){
        return "addNewCategory";
    }
    @RequestMapping("/A")
    public String getAAAAAAAAAAAA(){
        return "Error";
    }
    
}
