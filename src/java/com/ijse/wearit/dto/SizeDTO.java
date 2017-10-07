/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dto;

import org.springframework.stereotype.Component;

/**
 *
 * @author Harindu.sul
 */
@Component
public class SizeDTO extends SuperDTO{
    private Integer sizeID;
    private String sizeUK;
    private String sizeUS;
    private String sizeEU;
    private String size;//Xs,S,M,L,XL

    public SizeDTO(Integer sizeID, String sizeUK, String sizeUS, String sizeEU, String size) {
        this.sizeID = sizeID;
        this.sizeUK = sizeUK;
        this.sizeUS = sizeUS;
        this.sizeEU = sizeEU;
        this.size = size;
    }

    public SizeDTO() {
        
    }

    public String getSize() {
        return size;
    }
    public Integer getSizeID() {
        return sizeID;
    }

    public void setSizeID(Integer sizeID) {
        this.sizeID = sizeID;
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
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }
  
}
