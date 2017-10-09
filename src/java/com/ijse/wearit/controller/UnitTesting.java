/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Category;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.service.custom.CategoryService;
import com.ijse.wearit.service.custom.ItemDetailsService;
import com.ijse.wearit.service.custom.ItemService;
import com.ijse.wearit.service.custom.SizeService;
import java.util.HashSet;
import java.util.Set;
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
    public String navSome(){
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
         boolean result = false;

         try {
//         Category category2 = new Category();
//         category2.setName("Office wear");
//         categoryService.add(category2);
//         Category category = new Category();
//         category.setName("New Arrivals");
//         categoryService.add(category);
//         Category category3 = new Category();
//         category3.setName("Casual");
//         categoryService.add(category3);
//        Sizes size = new Sizes();
//        size.setSizes("XS");
//        size.setSizeEU("28");
//        size.setSizeUK("10");
//        size.setSizeUS("8");
//        sizeService.add(size);
//        Sizes size2 = new Sizes();
//        size2.setSizes("S");
//        size2.setSizeEU("30");
//        size2.setSizeUK("12");
//        size2.setSizeUS("10");
//        sizeService.add(size2);
//        Sizes size3 = new Sizes();
//        size3.setSizes("M");
//        size3.setSizeEU("32");
//        size3.setSizeUK("12");
//        size3.setSizeUS("14");
//        sizeService.add(size3);
//        //Create New Item
//        Item item = new Item();
//        item.setDescription("Short top");
//        item.setPaths("Image/Tops/crop_tops.jpg");
//        Category casual = categoryService.getCategoryByName("Casual");
//        item.setCategory(casual);
//        casual.getItems().add(item);
//        //itemService.add(item);
//        //search Size//
//        Sizes size11 = sizeService.getSizeByName("M");
//        Sizes size22 = sizeService.getSizeByName("S");
//        Sizes size33 = sizeService.getSizeByName("XS");
//        
//        //create ItemDetails 1
//        ItemDetails itemDetails1 = new ItemDetails();
//        itemDetails1.setQtyOnHand(5);
//        itemDetails1.setUnitPrice(750.00);
//        itemDetails1.setItem(item);
//        itemDetails1.setSizes(size11);
//        item.getItemDetails().add(itemDetails1);
//        size11.getItemDetails().add(itemDetails1);
//        
//        //create ItemDetails 2
//        ItemDetails itemDetails2 = new ItemDetails();
//        itemDetails2.setQtyOnHand(12);
//        itemDetails2.setUnitPrice(1250.00);
//        itemDetails2.setItem(item);
//        itemDetails2.setSizes(size22);
//        item.getItemDetails().add(itemDetails2);
//        size22.getItemDetails().add(itemDetails2);
//        
//        //create ItemDetails 3
//        ItemDetails itemDetails3 = new ItemDetails();
//        itemDetails3.setQtyOnHand(8);
//        itemDetails3.setUnitPrice(1150.00);
//        itemDetails3.setItem(item);
//        itemDetails3.setSizes(size33);
//        item.getItemDetails().add(itemDetails3);
//        size33.getItemDetails().add(itemDetails3);
//        
//        Set<ItemDetails> all=new HashSet<ItemDetails>();
//        all.add(itemDetails3);
//        all.add(itemDetails2);
//        all.add(itemDetails1);
//        
//        item.setItemDetails(all);
//         result=itemService.add(item);
            Item itemByDescription = itemService.getItemByDescription("Short top");
            result=itemService.delete(itemByDescription.getItemCode());
        
     
        


        
             
//             
             
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
        } catch (Exception ex) {
            System.out.println("----------------    exeption here=   "+ex + "---------------------------");
            System.out.println("----------------    exeption here=   "+ex + "---------------------------");
            System.out.println("----------------    exeption here=   "+ex + "---------------------------");
            System.out.println("----------------    exeption here=   "+ex + "---------------------------");
            
        }
        if (result) {
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



/*
//example for composite relations all new entities (User, Group and UserGroup):

User user = new User("sam", "mas", "sam@gmail.com");
 
Group group = new Group("Designer");
session.save(group);
 
UserGroup userGroup = new UserGroup();
userGroup.setGroup(group);
userGroup.setUser(user);
userGroup.setActivated(true);
userGroup.setRegisteredDate(new Date());
 
user.addUserGroup(userGroup);
 
session.save(user);


// this user is obtained from the database with ID 40
User user = (User) session.get(User.class, new Long(40));
 
// this group is obtained from the database with ID 26
Group group = (Group) session.get(Group.class, new Long(26));
 
UserGroup userGroup = new UserGroup();
userGroup.setGroup(group);
userGroup.setUser(user);
userGroup.setActivated(true);
userGroup.setRegisteredDate(new Date());
 
session.save(userGroup);

////////////////////////////////////////////////
delete example

UserGroup userGroup = new UserGroup();
 
User user = new User();
user.setId(39);
userGroup.setUser(user);
 
Group group = new Group();
group.setId(25);
userGroup.setGroup(group);
 
session.delete(userGroup);


*/
//////////////////---Continue----/////////////////////////////////
/*    //Create New Item
        boolean ifAdded = false;
        Item item = new Item();
        item.setDescription("Short top");
        item.setPath("Image/Tops/ss1.jpg");
        Category category1 = categoryService.getCategoryByName("Casual");
        item.setCategory(category1);
        category1.getItems().add(item);
        //itemService.add(item);
        //search Size//
        Size size1 = sizeService.getSizeByName("M");
        Size size2 = sizeService.getSizeByName("S");
        Size size3 = sizeService.getSizeByName("XL");
        
        //create ItemDetails 1
        ItemDetails itemDetails1 = new ItemDetails();
        itemDetails1.setQtyOnHand(10);
        itemDetails1.setUnitPrice(750.00);
        itemDetails1.setItem(item);
        itemDetails1.setSize(size1);
        item.getItemDetails().add(itemDetails1);
        size1.getItemDetails().add(itemDetails1);
        
        //create ItemDetails 2
        ItemDetails itemDetails2 = new ItemDetails();
        itemDetails2.setQtyOnHand(12);
        itemDetails2.setUnitPrice(1250.00);
        itemDetails2.setItem(item);
        itemDetails2.setSize(size2);
        item.getItemDetails().add(itemDetails2);
        size2.getItemDetails().add(itemDetails2);
        
        //create ItemDetails 3
        ItemDetails itemDetails3 = new ItemDetails();
        itemDetails3.setQtyOnHand(8);
        itemDetails3.setUnitPrice(1150.00);
        itemDetails3.setItem(item);
        itemDetails3.setSize(size3);
        item.getItemDetails().add(itemDetails3);
        size3.getItemDetails().add(itemDetails3);
        
        Set<ItemDetails> all=new HashSet<ItemDetails>();
        all.add(itemDetails3);
        all.add(itemDetails2);
        all.add(itemDetails1);
        
        item.setItemDetails(all);
        
        
        //itemDetailsService.add(itemDetails);
        
        ifAdded = itemService.add(item); */

/* ///////////////////-------- Add New Data ------------/////////////////////
        //Create new Category
        boolean ifAdded = false;
        
        Category category = new Category();
        category.setName("Pure white");
        ifAdded = categoryService.add(category);
        
        //Create new Items
        Item item = new Item();
        item.setDescription("SSDress");
        item.setPath("Image/SSDress/ssdresses.jpg");
        item.setCategory(category);
        category.getItems().add(item);
        if(ifAdded != false){
            ifAdded = itemService.add(item);
        }
        
        Item item1 = new Item();
        item1.setDescription("SCLaced");
        item1.setPath("Image/SCLaced/sclaced.jpg");
        item1.setCategory(category);
        category.getItems().add(item1);
        if(ifAdded != false){
            ifAdded = itemService.add(item1);
        }
        
        Item item2 = new Item();
        item2.setDescription("GFlared");
        item2.setPath("Image/GFlared/gflared.jpg");
        item2.setCategory(category);
        category.getItems().add(item2);
        if(ifAdded != false){
            ifAdded = itemService.add(item2);
        }
        
        //Get Sizes
        Size size = sizeService.getSizeByName("M");
        Size size1 = sizeService.getSizeByName("S");
        
        //Create new ItemDetails for 1st item
        ItemDetails itemDetails = new ItemDetails();
        itemDetails.setQtyOnHand(5);
        itemDetails.setUnitPrice(2000);
        itemDetails.setItem(item);
        itemDetails.setSize(size);
        item.getItemDetails().add(itemDetails);
        size.getItemDetails().add(itemDetails);
        if(ifAdded != false){
            ifAdded = itemDetailsService.add(itemDetails);
        }
        
        ItemDetails itemDetails1 = new ItemDetails();
        itemDetails1.setQtyOnHand(4);
        itemDetails1.setUnitPrice(1900);
        itemDetails1.setItem(item);
        itemDetails1.setSize(size1);
        item.getItemDetails().add(itemDetails);
        size1.getItemDetails().add(itemDetails);
        if(ifAdded != false){
            ifAdded = itemDetailsService.add(itemDetails1);
        }
        
        //Create new ItemDetails for 2nd item
        ItemDetails itemDetails2 = new ItemDetails();
        itemDetails2.setQtyOnHand(10);
        itemDetails2.setUnitPrice(900);
        itemDetails2.setItem(item1);
        itemDetails2.setSize(size);
        item1.getItemDetails().add(itemDetails);
        size.getItemDetails().add(itemDetails);
        if(ifAdded != false){
            ifAdded = itemDetailsService.add(itemDetails2);
        }
        
        ItemDetails itemDetails3 = new ItemDetails();
        itemDetails3.setQtyOnHand(4);
        itemDetails3.setUnitPrice(850);
        itemDetails3.setItem(item1);
        itemDetails3.setSize(size1);
        item1.getItemDetails().add(itemDetails);
        size1.getItemDetails().add(itemDetails);
        if(ifAdded != false){
            ifAdded = itemDetailsService.add(itemDetails3);
        }
        
        //Create new ItemDetails for 3rd item
        ItemDetails itemDetails4 = new ItemDetails();
        itemDetails4.setQtyOnHand(40);
        itemDetails4.setUnitPrice(1100);
        itemDetails4.setItem(item2);
        itemDetails4.setSize(size);
        item2.getItemDetails().add(itemDetails);
        size.getItemDetails().add(itemDetails);
        if(ifAdded != false){
            ifAdded = itemDetailsService.add(itemDetails4);
        }
        
        ItemDetails itemDetails5 = new ItemDetails();
        itemDetails5.setQtyOnHand(10);
        itemDetails5.setUnitPrice(1000);
        itemDetails5.setItem(item2);
        itemDetails5.setSize(size1);
        item2.getItemDetails().add(itemDetails);
        size1.getItemDetails().add(itemDetails);
        if(ifAdded != false){
            ifAdded = itemDetailsService.add(itemDetails5);
        }
        
*/