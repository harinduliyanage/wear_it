/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Harindu.sul
 */
@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Integer userID;
    private String userName;
    private String password;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail; 
    
//    @OneToOne(mappedBy = "user",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER,optional = true,orphanRemoval = true)
//    private ShoppingCart shoppingCart;

//    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER,optional = false,orphanRemoval = true)
//    private ShippingInfo shippinInfo;
    
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

//    public ShippingInfo getShippinInfo() {
//        return shippinInfo;
//    }
//
//    public void setShippinInfo(ShippingInfo shippinInfo) {
//        this.shippinInfo = shippinInfo;
//    }

//    public ShoppingCart getShoppingCart() {
//        return shoppingCart;
//    }
//
//    public void setShoppingCart(ShoppingCart shoppingCart) {
//        this.shoppingCart = shoppingCart;
//    }
}
