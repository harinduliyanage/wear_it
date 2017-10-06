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
public class ShoppingCartDetailCompositeIdDTO extends SuperDTO{
    private ShoppingCartDTO shoppingCartDTO;
    private ItemDetailsDTO itemDetalsDTO;

    public ShoppingCartDTO getShoppingCartDTO() {
        return shoppingCartDTO;
    }

    public void setShoppingCartDTO(ShoppingCartDTO shoppingCartDTO) {
        this.shoppingCartDTO = shoppingCartDTO;
    }

    public ItemDetailsDTO getItemDetalsDTO() {
        return itemDetalsDTO;
    }

    public void setItemDetalsDTO(ItemDetailsDTO itemDetalsDTO) {
        this.itemDetalsDTO = itemDetalsDTO;
    }
    
    
    
}
