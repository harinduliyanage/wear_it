/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Harindu.sul
 */
@Entity
@Table(name = "SHOPPINGCART_DETAILS")
public class ShoppingCartDetails implements Serializable{
    //private ShoppingCartDetailCompositeId primaryKey = new ShoppingCartDetailCompositeId();
    private int id;
    private ShoppingCart shoppingCart;
    private ItemDetails itemDetails;
    
    private int orderQty;
    private double amount;
    
//    @EmbeddedId
//    public ShoppingCartDetailCompositeId getPrimaryKey() {
//        return primaryKey;
//    }
// 
//    public void setPrimaryKey(ShoppingCartDetailCompositeId primaryKey) {
//        this.primaryKey = primaryKey;
//    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CART_DETAILS_ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @ManyToOne(cascade = CascadeType.PERSIST,optional = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "SHOPPINGCART_ID",nullable=false)
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinColumn(name = "ITEM_DETAILS_ID")
    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }
    
    
    
//    public String getDescription() {
//        return getPrimaryKey().getItemDetails().getItem().getDescription();
//    }
// 
//    public void setDescription(String description) {
//        getPrimaryKey().getItemDetails().getItem().setDescription(description);
//    }
//    
//    public String getPath() {
//        return getPrimaryKey().getItemDetails().getItem().getPaths();
//    }
// 
//    public void setPath(String path) {
//        getPrimaryKey().getItemDetails().getItem().setPaths(path);
//    }
//    public double getUnitPrice(){
//       return getPrimaryKey().getItemDetails().getUnitPrice();
//    }
//    public void setUnitPrice(double unitPrice){
//        getPrimaryKey().getItemDetails().setUnitPrice(unitPrice);
//    }

    /**
     * @return the orderQty
     */
    public int getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
