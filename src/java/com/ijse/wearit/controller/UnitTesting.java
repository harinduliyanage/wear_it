/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Category;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Size;
import com.ijse.wearit.service.custom.CategoryService;
import com.ijse.wearit.service.custom.ItemDetailsService;
import com.ijse.wearit.service.custom.ItemService;
import com.ijse.wearit.service.custom.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ABC
 */
@Controller
public class UnitTesting {

    @Autowired
    private SizeService sizeService;
    @Autowired
    private ItemDetailsService itemDetailsService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/test")
    public String navSome() throws Exception {
        //test Size model
//////////        Size size = new Size();
//////////        size.setSize("M");
//////////        size.setSizeEU("42");
//////////        size.setSizeUK("12");
//////////        size.setSizeUS("10");

                boolean ifAdded = false;
        //Create New Category
        Category category1 = new Category();
        category1.setName("Casual");
        categoryService.add(category1);
        //Create New Item
        Item item = new Item();
        item.setDescription("Skirt");
        item.setPath("Image/Skirt/skirt.jpg");
        item.setCategory(category1);
        category1.getItems().add(item);
        itemService.add(item);
        //create Size//
        Size size = new Size();
        size.setSize("S");
        size.setSizeEU("22");
        size.setSizeUK("12");
        size.setSizeUS("10");
        sizeService.add(size);
        //create ItemDetails
        ItemDetails itemDetails = new ItemDetails();
        itemDetails.setQtyOnHand(5);
        itemDetails.setUnitPrice(100.00);
        itemDetails.setItem(item);
        itemDetails.setSize(size);
        item.getItemDetails().add(itemDetails);
        size.getItemDetails().add(itemDetails);
        //itemDetailsService.add(itemDetails);
        
        ifAdded = itemDetailsService.add(itemDetails);

        System.out.println("*****************************");

        try {

        } catch (Exception ex) {
            System.out.println(ex + "---------------------------");
            System.out.println(ex + "---------------------------");
            System.out.println(ex + "---------------------------");
            System.out.println(ex + "---------------------------");
        }
        if (ifAdded) {
            return "Success";
        } else {
            return "Error";
        }
    }

}
/*
Category categoryByName = categoryService.getCategoryByName("Sport");
if(categoryByName!=null){
                
                item.setCategory(categoryByName);
                add=itemService.add(item);
                System.out.println(categoryByName.getCategoryid()+""+categoryByName.getName());
            }
 */





//        Size size = new Size();
//        size.setSize("XL");
//        size.setSizeEU("66");
//        size.setSizeUK("22");
//        size.setSizeUS("12");
//        sizeService.add(size);
//
//        ItemDetails itemDetails = new ItemDetails();
//        itemDetails.setQtyOnHand(10);
//        itemDetails.setUnitPrice(1200);
//
//        Category category = categoryService.getCategoryByName("Party");
//        int categoryID = category.getCategoryid();
//        //List<Item> itemList = (List<Item>) category.getItems();
//        System.out.println(categoryID + "    yeyeyyeyeyyeyeyeyyeyeyeyyeyeyyeyyeyeyeyey");
//        List<Item> itemList = itemService.getAll();
//
//        for (Item searchItem : itemList) {
//            if (searchItem.getCategory().getCategoryid().equals(categoryID)) {
//                System.out.println(searchItem.getCategory().getCategoryid()+"   YYYYYYYYYYYYYYYYYYYYYYYYYYY");
//
//                if (searchItem.getDescription().equalsIgnoreCase("Frock")) {
//                    System.out.println(searchItem.getDescription()+"      PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
//                    //Item item = itemService.getItemByDescription("Frock");
//                    searchItem.getItemDetails().add(itemDetails);
//                    itemDetails.setItem(searchItem);
//                    //itemService.
//                }
//            }
//        }
//
//        //itemService.add(item);
//        itemDetails.setSize(size);
//
//        boolean ifAdded = false;
//        ifAdded = itemDetailsService.add(itemDetails);