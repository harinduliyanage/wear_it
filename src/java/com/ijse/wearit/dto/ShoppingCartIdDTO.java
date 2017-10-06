/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dto;

import org.springframework.stereotype.Component;

/**
 *
 * @author ABC
 */
@Component
public class ShoppingCartIdDTO extends SuperDTO{
    private ItemDetailsDTO itemDetailsDTO;
    private ShoppingCartDTO shoppingCartDTO;

    public ItemDetailsDTO getItemDetailsDTO() {
        return itemDetailsDTO;
    }

    public void setItemDetailsDTO(ItemDetailsDTO itemDetailsDTO) {
        this.itemDetailsDTO = itemDetailsDTO;
    }

    public ShoppingCartDTO getShoppingCartDTO() {
        return shoppingCartDTO;
    }

    public void setShoppingCartDTO(ShoppingCartDTO shoppingCartDTO) {
        this.shoppingCartDTO = shoppingCartDTO;
    }
    
    
    
}
