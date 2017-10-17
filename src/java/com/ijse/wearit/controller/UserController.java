/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.model.Status;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.UserService;
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
 * @author Harindu.sul
 */
@Controller
public class UserController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/registeUser")
    public @ResponseBody Status addNewUser(){
        Status status = new Status();
        
        return status;
    }
    
    @RequestMapping(value = "/getAllUsers" , method = RequestMethod.GET)
    public @ResponseBody List<User>  getAllUsers(){ 
        try {
            List<User> all = userService.getAll();
            System.out.println("called................ get All");
            return all;
            
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
