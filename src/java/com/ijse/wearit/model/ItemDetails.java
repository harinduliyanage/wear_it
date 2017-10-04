/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import java.io.Serializable;
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
@Table(name = "ITEM_DETAILS")
@AssociationOverrides({
    @AssociationOverride(name = "primaryKey.size",
        joinColumns = @JoinColumn(name = "SIZE_ID")),
    @AssociationOverride(name = "primaryKey.item",
        joinColumns = @JoinColumn(name = "ITEM_ID")) })
public class ItemDetails implements Serializable{
    private ItemDetailsId primeryKey=new ItemDetailsId();
    
    //additonal feelds
    private String unitPrice;
    private String qtyOnHand;
    
    @EmbeddedId
    public ItemDetailsId getPrimeryKey() {
        return primeryKey;
    }

    /**
     * @param primeryKey the primeryKey to set
     */
    public void setPrimeryKey(ItemDetailsId primeryKey) {
        this.primeryKey = primeryKey;
    }
    @Transient  
    public Item getItem(){
        return getPrimeryKey().getItem();
    }
    public void setItem(Item item){
        getPrimeryKey().setItem(item);
    }
    @Transient  
    public Size getSize(){
        return getPrimeryKey().getSize();
    }
    public void setSize(Size size){
        getPrimeryKey().setSize(size);
    }

    /**
     * @return the categoryId
     */
    @Transient  
    public String getCategoryName() {
        return getPrimeryKey().getItem().getCategory().getName();
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryName(String category) {
        getPrimeryKey().getItem().getCategory().setName(category);
    }

    /**
     * @return the path
     */
    @Transient  
    public String getPath() {
        return primeryKey.getItem().getPath();
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        getPrimeryKey().getItem().setPath(path);
    }

    /**
     * @return the unitPrice
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    @Transient  
    public String getDescription(){
        return getPrimeryKey().getItem().getDescription();
    }
    
    public void setDescription(String des){
        getPrimeryKey().getItem().setDescription(des);
    }

    /**
     * @return the qtyOnHand
     */
    public String getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setQtyOnHand(String qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
}
