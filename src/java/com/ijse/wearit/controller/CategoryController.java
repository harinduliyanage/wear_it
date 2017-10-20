/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Category;
import com.ijse.wearit.model.Status;
import com.ijse.wearit.service.custom.CategoryService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Harindu.sul
 */
@Controller
public class CategoryController {
    
    @Autowired
    CategoryService categoryService;
    @RequestMapping(value = "/getAllCategory" , method = RequestMethod.GET)
    public @ResponseBody List<Category>  getAllCategorys(){ 
        try {
            List<Category> all = categoryService.getAll();
            return all;
        } catch (Exception ex) {
            Logger.getLogger(SizeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @RequestMapping(value = "/addNewCategory",method = RequestMethod.POST) 
    public @ResponseBody Status addNewCategory(HttpServletRequest request,
            @RequestParam("categoryName")String name){
        
        Status status = new Status();
        boolean result = false;
        try {
            Category searchedCategory = categoryService.getCategoryByName(name);
            if(searchedCategory == null ){
                Category category = new Category();
                category.setName(name);
                result = categoryService.add(category);
                if(result){
                    status  = new Status(200, "Ok", "Added Successfully...");
                        return status;
                    }else{
                        status = new Status(500, "Internal Server Error", "Added Faild..");
                        return status;
                }
            }else{
                status = new Status(401,"bad request", "Category Alrady Exits"); 
                return status;
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;         
    }
    
    @RequestMapping(value = "/updateCategory", method = RequestMethod.POST)
    public @ResponseBody Status updateCategory(HttpServletRequest request,
            @RequestParam("category")String name,
            @RequestParam("newValue")String newValue){
        
        Status status = new Status();
        boolean result = false;
            
        try {
            Category searchedCategory = categoryService.getCategoryByName(name);
            searchedCategory.setName(newValue);
            result = categoryService.update(searchedCategory);
            if(result){
                status  = new Status(200, "Ok", "Updated Successfully...");
                return status;
            }else{
                status = new Status(500, "Internal Server Error", "Updating Faild..");
                return status;
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    @RequestMapping(value = "/deleteCategory", method = RequestMethod.POST )
    public @ResponseBody Status deleteCategory(HttpServletRequest request,
            @RequestParam("category") String category){
    
        Status status = new Status();
        boolean result = false;
            
        try {
            Category searchedCategory = categoryService.getCategoryByName(category);
            result = categoryService.delete(searchedCategory.getCategoryid());
            if(result){
                status  = new Status(200, "Ok", "Category : "+category+" deleted...");
                return status;
            }else{
                status = new Status(500, "Internal Server Error", "delete Faild..");
                return status;
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    @RequestMapping(value = "/getCategoryByName", method = RequestMethod.GET)
    public @ResponseBody Category getCategoryByName(HttpServletRequest request, 
            @RequestParam("size") String size){
        
        Category searchedCategory = null;
        try {
            searchedCategory = categoryService.getCategoryByName(size);
            return searchedCategory;
        } catch (Exception ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return searchedCategory;
    
    }
}
