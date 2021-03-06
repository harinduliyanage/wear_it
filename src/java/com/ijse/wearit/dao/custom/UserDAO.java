/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom;

import com.ijse.wearit.dao.SuperDAO;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.User;


public interface UserDAO extends SuperDAO<User>{
    public User getUserByUserName(String userName)throws Exception;
    public ShoppingCart getShoppingCartByUserId(Integer userId)throws Exception;
}
