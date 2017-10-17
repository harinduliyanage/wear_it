/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Status;
import com.ijse.wearit.service.custom.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public @ResponseBody Status addNewUser(HttpServletRequest request,@RequestParam("name") String name,
            @RequestParam("phone")String phoneNum,
            @RequestParam("mail")String mail,
            @RequestParam("pw")String pw){
        HttpSession session = request.getSession();
                System.out.println("called..."+name+"////"+mail+"////"+pw+"///////"+phoneNum);
        Status status = new Status();
        
        return status;
    }
}
