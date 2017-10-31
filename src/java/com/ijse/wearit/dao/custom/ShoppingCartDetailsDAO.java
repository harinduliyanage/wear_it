/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dao.custom;

import com.ijse.wearit.dao.SuperDAO;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.ShoppingCartDetails;
import java.util.List;

public interface ShoppingCartDetailsDAO extends SuperDAO<ShoppingCartDetails>{
    public ShoppingCartDetails getByItemDetail(Integer id) throws Exception ;
    public List<ShoppingCartDetails> getDetailsByCart(ShoppingCart shoppingCart) throws Exception ;
}
