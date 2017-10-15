/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Harindu.sul
 */
@Controller
public class DashBoardController {
    @RequestMapping("/items")
    public String getItemView(){
        return "Items";
    }
    @RequestMapping("/contact")
    public String getContact(){
        return "contact";
    }
    @RequestMapping("/checkout")
    public String getCheckOut(){
        return "checkout";
    }
    @RequestMapping("/404")
    public String get404(){
        return "404";
    }
}
