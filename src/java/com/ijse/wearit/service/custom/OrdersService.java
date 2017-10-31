/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom;

import com.ijse.wearit.model.Orders;
import com.ijse.wearit.service.SuperService;


public interface OrdersService extends SuperService<Orders>{
    public boolean addOrderss(String userName)throws Exception;
}
