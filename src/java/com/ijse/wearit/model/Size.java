/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Harindu.sul
 */
@Entity
public class Size implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String size;//Xs,S,M,L,XL
    private String sizeUK;
    private String sizeUS;
    private String sizeEU;
    
    @OneToMany(mappedBy = "size")
    Set<ItemDetails> itemDetails=new HashSet<ItemDetails>();

    public Size() {
    }
    
    public void addItemDetails(Set<ItemDetails> itemDetails){
        this.itemDetails=itemDetails;
    }
    
    public Set<ItemDetails> getItemDetails(){
        return this.itemDetails;
    }
    
    public void addToItemDetail(ItemDetails itemDetails){
        this.itemDetails.add(itemDetails);
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer sizeID) {
        this.id = sizeID;
    }

    public String getSizeUK() {
        return sizeUK;
    }

    public void setSizeUK(String sizeUK) {
        this.sizeUK = sizeUK;
    }

    public String getSizeUS() {
        return sizeUS;
    }

    public void setSizeUS(String sizeUS) {
        this.sizeUS = sizeUS;
    }

    public String getSizeEU() {
        return sizeEU;
    }

    public void setSizeEU(String sizeEU) {
        this.sizeEU = sizeEU;
    }

    /**
     * @param SizeinAsia the SizeinAsia to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }
  
}
