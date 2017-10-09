/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Harindu.sul
 */
@Entity
@Table(name = "ITEM_DETAILS")
public class ItemDetails implements Serializable{
    
    private Integer id;
    private Sizes sizes;
    private Item item;
    //additonal feelds
    private double unitPrice;
    private int qtyOnHand;
    private Set<ShoppingCartDetails> shoppingCartDetails = new HashSet<ShoppingCartDetails>();
    
    public ItemDetails(){
        
    }
    
    
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
   

    /**
     * @return the qtyOnHand
     */
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ITEMDETAILS_ID")
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "SIZES_ID")  
    public Sizes getSizes() {
        return sizes;
    }

    
    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    /**
     * @return the item
     */
    @ManyToOne(cascade = CascadeType.ALL,optional = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "ITEM_ID")  
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }
    
    @OneToMany(mappedBy = "primaryKey.itemDetails",
            cascade = CascadeType.ALL)
    public Set<ShoppingCartDetails> getShoppingCartDetails() {
        return shoppingCartDetails;
    }
 
    public void setShoppingCartDetails(Set<ShoppingCartDetails> shoppingCartDetailses) {
        this.shoppingCartDetails = shoppingCartDetailses;
    }
}
