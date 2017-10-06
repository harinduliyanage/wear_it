/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dto;

import com.ijse.wearit.model.Item;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 *
 * @author Harindu.sul
 */
@Component
public class CategoryDTO {
    private Integer id;
    private String name;
    private Set<ItemDTO> itemsDTO;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Set<ItemDTO> getItemsDTO() {
        return itemsDTO;
    }

    public void setItemsDTO(Set<ItemDTO> itemsDTO) {
        this.itemsDTO = itemsDTO;
    }

    
    
}
