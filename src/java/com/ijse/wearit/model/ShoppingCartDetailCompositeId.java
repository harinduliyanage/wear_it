/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author Harindu.sul
 */
@Embeddable
class ShoppingCartDetailCompositeId  implements Serializable{
    private ShoppingCart shoppingCart;
    private ItemDetails itemDetals;

    /**
     * @return the shoppingCart
     */
    @ManyToOne(cascade = CascadeType.ALL)
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    /**
     * @param shoppingCart the size to set
     */
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    /**
     * @return the itemDetails
     */
    @ManyToOne(cascade = CascadeType.ALL)
    public ItemDetails getItemDetails() {
        return itemDetals;
    }

    /**
     * @param itemDetails the item to set
     */
    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetals = itemDetails;
    }
}
