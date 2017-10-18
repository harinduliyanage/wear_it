/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Status;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.UserService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public @ResponseBody Status addNewUser(HttpServletRequest request,
            @RequestParam("Fname") String fName,
            @RequestParam("Lname")String lName,
            @RequestParam("phone")String phoneNum,
            @RequestParam("address")String address,
            @RequestParam("city")String city,
            @RequestParam("country")String country,
            @RequestParam("mail")String mail,
            @RequestParam("pw")String pw,
            @RequestParam("postal")String postalCode){
            // Code Here for add User And Shipping infor to database;
            //Please check email by user Already Exits ..
            //If user Already Exits you have to set new Staus (401,bad request, user Alrady Exits); and return it ;
            //else return new Status(200,ok,user sign Up successfully..); return it
            
                System.out.println("called..."+fName+"////"+lName+"////"+pw+"////"+postalCode+"///"+phoneNum);
                System.out.println("called..."+city+"////"+address+"////"+country+"///////"+mail+"***"+pw);
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
