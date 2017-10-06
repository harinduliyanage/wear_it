/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Harindu.sul
 */
@Entity
@Table(name = "SHOPPINGCART_DETAILS")
@AssociationOverrides({
    @AssociationOverride(name = "primaryKey.shoppingCart",
        joinColumns = @JoinColumn(name = "CART_ID")),
    @AssociationOverride(name = "primaryKey.itemDetails",
        joinColumns = @JoinColumn(name = "ITEMDETAILS_ID")) })
public class ShoppingCartDetails {
    private ShoppingCartDetailCompositeId primaryKey = new ShoppingCartDetailCompositeId();
    
    @EmbeddedId
    public ShoppingCartDetailCompositeId getPrimaryKey() {
        return primaryKey;
    }
 
    public void setPrimaryKey(ShoppingCartDetailCompositeId primaryKey) {
        this.primaryKey = primaryKey;
    }
    @Transient
    public ShoppingCart getShoppingCart() {
        return getPrimaryKey().getShoppingCart();
    }
 
    public void setShoppingCart(ShoppingCart shoppingCart) {
        getPrimaryKey().setShoppingCart(shoppingCart);
    }
 
    @Transient
    public ItemDetails getItemDetails() {
        return getPrimaryKey().getItemDetails();
    }
 
    public void setItemDetails(ItemDetails itemDetails) {
        getPrimaryKey().setItemDetails(itemDetails);
    }
    public String getDescription() {
        return getPrimaryKey().getItemDetails().getItem().getDescription();
    }
 
    public void setDescription(String description) {
        getPrimaryKey().getItemDetails().getItem().setDescription(description);
    }
    
    public String getPath() {
        return getPrimaryKey().getItemDetails().getItem().getPath();
    }
 
    public void setPath(String path) {
        getPrimaryKey().getItemDetails().getItem().setPath(path);
    }
    
}
