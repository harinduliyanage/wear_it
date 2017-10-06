/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import com.ijse.wearit.model.ItemDetails;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Harindu.sul
 */
@Embeddable
public class ShoppingCartId {
    private ItemDetails itemDetails;
    private ShoppingCart shoppingCart;

    /**
     * @return the itemDetails
     */
    @ManyToOne(cascade = CascadeType.ALL)
    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    /**
     * @param itemDetails the itemDetails to set
     */
    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

    /**
     * @return the shoppingCart
     */
    @ManyToOne(cascade = CascadeType.ALL)
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    /**
     * @param shoppingCart the shoppingCart to set
     */
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    
}
