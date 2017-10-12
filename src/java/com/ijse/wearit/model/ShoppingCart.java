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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Harindu.sul
 */
@Entity
public class ShoppingCart implements Serializable{
    private Integer id;
    private String addedDate;
    private User user;
    private int numberOfItems;
    private double total;
    
    private Set<ShoppingCartDetails> shoppingCartDetails = new HashSet<ShoppingCartDetails>();

    public ShoppingCart() {
    }
    
    public void addShoppingCartDetail(ShoppingCartDetails shoppingCartDetails){
        this.shoppingCartDetails.add(shoppingCartDetails);
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CART_ID")
    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) { 
        this.addedDate = addedDate;
    }
   
    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER,optional = true)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    @OneToMany(mappedBy = "primaryKey.shoppingCart",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public Set<ShoppingCartDetails> getShoppingCartDetails() {
        return shoppingCartDetails;
    }
 
    public void setShoppingCartDetails(Set<ShoppingCartDetails> shoppingCartDetailses) {
        this.shoppingCartDetails = shoppingCartDetailses;
    }
    
}
