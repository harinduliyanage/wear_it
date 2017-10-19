/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dto;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 *
 * @author ABC
 */
@Component
public class ItemDetailsDTO extends SuperDTO{

    private Integer id;
    private SizeDTO sizeDTO;
    private ItemDTO itemDTO;
    private double unitPrice;
    private int qtyOnHand;
    private Set<ShoppingCartDetailsDTO> shoppingCartDetails = new HashSet<ShoppingCartDetailsDTO>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SizeDTO getSizeDTO() {
        return sizeDTO;
    }

    public void setSizeDTO(SizeDTO sizeDTO) {
        this.sizeDTO = sizeDTO;
    }

    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public Set<ShoppingCartDetailsDTO> getShoppingCartDetails() {
        return shoppingCartDetails;
    }

    
    
}
