/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Harindu.sul
 */
@Entity
public class ShippingInfo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    private Integer id;
    
    private String FName;
    private String LName;
    private String AddressLine1;
    private String City;
    private String contry;
    private String PostalCode;
    private String ContactNum;
    
    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    
    ShippingInfo(){
        
    }

    /**
     * @return the FName
     */
    public String getFName() {
        return FName;
    }

    /**
     * @param FName the FName to set
     */
    public void setFName(String FName) {
        this.FName = FName;
    }

    /**
     * @return the LName
     */
    public String getLName() {
        return LName;
    }

    /**
     * @param LName the LName to set
     */
    public void setLName(String LName) {
        this.LName = LName;
    }

    /**
     * @return the AddressLine1
     */
    public String getAddressLine1() {
        return AddressLine1;
    }

    /**
     * @param AddressLine1 the AddressLine1 to set
     */
    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City the City to set
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the contry
     */
    public String getContry() {
        return contry;
    }

    /**
     * @param contry the contry to set
     */
    public void setContry(String contry) {
        this.contry = contry;
    }

    /**
     * @return the PostalCode
     */
    public String getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode the PostalCode to set
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * @return the ContactNum
     */
    public String getContactNum() {
        return ContactNum;
    }

    /**
     * @param ContactNum the ContactNum to set
     */
    public void setContactNum(String ContactNum) {
        this.ContactNum = ContactNum;
    }
    
    
    
}
