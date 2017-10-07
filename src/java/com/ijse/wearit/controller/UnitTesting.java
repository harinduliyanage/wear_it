/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Size;
import com.ijse.wearit.service.custom.SizeService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ABC
 */
@Controller
public class UnitTesting {
    
    @Autowired
    private SizeService serviceImpl;
    
    @RequestMapping(value = "/test")
    public String navSome(){
        //test model <3
        Size size = new Size();
        size.setSize("XS");
        size.setSizeEU("32");
        size.setSizeUK("10");
        size.setSizeUS("8");
        boolean add =false;
        try {
            
            add=serviceImpl.add(size);
            System.out.println(add);
        } catch (Exception ex) {
            Logger.getLogger(UnitTesting.class.getName()).log(Level.SEVERE, null, ex);
        }
            if(add){
        return "Success";
        }else{
            return "Error";
        }
    }
    
}
