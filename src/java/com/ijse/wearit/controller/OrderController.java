/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.service.custom.OrdersService;
import com.ijse.wearit.service.custom.UserService;
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
public class OrderController {
    @Autowired
    OrdersService orderService;
    
    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/placeOrder",method = RequestMethod.POST)
    public @ResponseBody boolean addOrdersss(@RequestParam("userName")String userName,
            HttpServletRequest request){
    
        boolean result = false;
        try {
            result = orderService.addOrderss(userName);
            HttpSession session = request.getSession();
            session.setAttribute("shoppingCartDetails",null);
            
        } catch (Exception ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
