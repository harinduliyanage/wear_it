/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Harindu.sul
 */
@Entity
public class OrderDetails {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
     @ManyToOne(cascade = CascadeType.ALL)
     private Orders order;
     private int orderQty;
     private String description;
     private int itemDetailsID;

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

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the itemDetailsID
     */
    public int getItemDetailsID() {
        return itemDetailsID;
    }

    /**
     * @param itemDetailsID the itemDetailsID to set
     */
    public void setItemDetailsID(int itemDetailsID) {
        this.itemDetailsID = itemDetailsID;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the order
     */
    public Orders getOrder() {
        return order;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(Orders order) {
        this.order = order;
    }
    
     public Integer getOrderID() {
        return order.getId();
    }

    /**
     * @param order the order to set
     */
    public void setOrderID(Integer id) {
        this.order.setId(id);
    }
    
}
