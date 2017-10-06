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
public class ItemDTO {
    private Integer id;
    private String description;
    private String path;
    private CategoryDTO categoryDTO;

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
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the categoryDTO
     */
    public CategoryDTO getCategoryDTO() {
        return categoryDTO;
    }

    /**
     * @param categoryDTO the categoryDTO to set
     */
    public void setCategoryDTO(CategoryDTO categoryDTO) {
        this.categoryDTO = categoryDTO;
    }
    
}
