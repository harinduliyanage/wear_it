/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.ShippingInfo;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.Status;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.UserService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
            @RequestParam("pw")String password,
            @RequestParam("postal")String postalCode){
            
            boolean result = false;
            Status status=new Status();
            
            //create shipping info
            ShippingInfo shippingInfo = new ShippingInfo();
            shippingInfo.setAddressLine1(address);
            shippingInfo.setPostalCode(postalCode);
            shippingInfo.setfName(fName);
            shippingInfo.setlName(lName);
            shippingInfo.setCity(city);
            shippingInfo.setCountry(country);
            shippingInfo.setContactNum(phoneNum);
            
            //Create User
            User user = new User();
            user.setCustomerFirstName(fName);
            user.setCustomerLastName(lName);
            user.setCustomerEmail(mail);
            user.setUserName(mail);
            user.setPassword(password);
            user.setShippinInfo(shippingInfo);
            
            //Create ShoppingCart
            ShoppingCart cart = new ShoppingCart();    
            Date date =new Date();
            SimpleDateFormat newFormat = new SimpleDateFormat("MM-dd-yyyy");
            String finalString = newFormat.format(date);
            cart.setAddedDate(finalString);
            cart.setNumberOfItems(0);
            cart.setTotal(0.00);
            user.setShoppingCart(cart);
            
        try {
            User searchedUser = userService.getUserByNam(mail);
            if(searchedUser == null){
                result = userService.add(user);
                if(result){
                    status  = new Status(200, "Ok", "Added Successfully...");
                    return status;
                }else{
                    status = new Status(500, "Internal Server Error", "Added Faild..");
                    return status;
                }
            }else{
                status = new Status(401,"bad request", "user Alrady Exits"); 
                return status;
            }
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
