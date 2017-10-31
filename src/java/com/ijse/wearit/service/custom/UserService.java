/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom;

import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.SuperService;


public interface UserService extends SuperService<User>{
    public  User getUserByNam(String userName)throws Exception;
    public ShoppingCart getShoppingCartByUserId(Integer userId)throws Exception;
}
