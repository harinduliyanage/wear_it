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
public class ShoppingCartDTO {
    private Integer id;
    private String addedDate;
    private UserDTO userDTO;
    
    private Set<ShoppingCartDetailsDTO> shoppingCartDetails = new HashSet<ShoppingCartDetailsDTO>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public Set<ShoppingCartDetailsDTO> getShoppingCartDetails() {
        return shoppingCartDetails;
    }

    public void setShoppingCartDetails(Set<ShoppingCartDetailsDTO> shoppingCartDetails) {
        this.shoppingCartDetails = shoppingCartDetails;
    }
    
    
    
}
