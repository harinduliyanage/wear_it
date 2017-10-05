/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Harindu.sul
 */
@Entity
public class Size implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String SizeinAsia;
    private String sizeUK;
    private String sizeUS;
    private String sizeEU;

    public Integer getSizeID() {
        return id;
    }

    public void setSizeID(Integer sizeID) {
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
     * @return the SizeinAsia
     */
    public String getSizeinAsia() {
        return SizeinAsia;
    }

    /**
     * @param SizeinAsia the SizeinAsia to set
     */
    public void setSizeinAsia(String SizeinAsia) {
        this.SizeinAsia = SizeinAsia;
    }
  
}
