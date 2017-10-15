/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom;

import com.ijse.wearit.model.ShoppingCartDetails;
import com.ijse.wearit.service.SuperService;

/**
 *
 * @author ABC
 */
public interface ShoppingCartDetailsService extends SuperService<ShoppingCartDetails>{
    public ShoppingCartDetails getByItemDetail(Integer id) throws Exception ;
    public ShoppingCartDetails getByOrderQty(Integer orderQty) throws Exception ;
}
