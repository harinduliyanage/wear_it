/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.controller;

import com.ijse.wearit.model.Category;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.OrderDetails;
import com.ijse.wearit.model.Orders;
import com.ijse.wearit.model.Payment;
import com.ijse.wearit.model.PaymentMethod;
import com.ijse.wearit.model.ShippingInfo;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.ShoppingCartDetailCompositeId;
import com.ijse.wearit.model.ShoppingCartDetails;
import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.CategoryService;
import com.ijse.wearit.service.custom.ItemDetailsService;
import com.ijse.wearit.service.custom.ItemService;
import com.ijse.wearit.service.custom.OrderDetailsService;
import com.ijse.wearit.service.custom.OrdersService;
import com.ijse.wearit.service.custom.PaymentMethodService;
import com.ijse.wearit.service.custom.PaymentService;
import com.ijse.wearit.service.custom.ShippingInfoService;
import com.ijse.wearit.service.custom.ShoppingCartDetailsService;
import com.ijse.wearit.service.custom.ShoppingCartService;
import com.ijse.wearit.service.custom.SizeService;
import com.ijse.wearit.service.custom.UserService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UnitTesting {

    @Autowired
    private ShoppingCartService cartService;
    @Autowired
    private ShoppingCartDetailsService cartDetailsService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private ItemDetailsService itemDetailsService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private UserService userService;
    @Autowired
    private ShippingInfoService shippingInfoService;
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private OrderDetailsService orderDetailsService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private PaymentMethodService paymentMethodService;

    @RequestMapping(value = "/test")
    public String navSome() {
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");
        boolean result = false;

        try {                
/*
            //Create Category 1
            Category category = new Category();
            category.setName("New Arrivals");
            categoryService.add(category);
            
            //Create Category 2
            Category category2 = new Category();
            category2.setName("Office wear");
            categoryService.add(category2);
            
            //Create Category 3
            Category category3 = new Category();
            category3.setName("Casual");
            categoryService.add(category3);
            
            
            //Create Size 1
            Sizes size = new Sizes();
            size.setSizes("XS");
            size.setSizeEU("28");
            size.setSizeUK("10");
            size.setSizeUS("8");
            sizeService.add(size);
            
            //Create Size 2
            Sizes size2 = new Sizes();
            size2.setSizes("S");
            size2.setSizeEU("30");
            size2.setSizeUK("12");
            size2.setSizeUS("10");
            sizeService.add(size2);
            
            //Create Size 3
            Sizes size3 = new Sizes();
            size3.setSizes("M");
            size3.setSizeEU("32");
            size3.setSizeUK("12");
            size3.setSizeUS("14");
            sizeService.add(size3);
            
            
            //Create New Item
            Item item = new Item();
            item.setDescription("Short top");
            item.setPaths("Image/Tops/crop_tops.jpg");
            Category casual = categoryService.getCategoryByName("Casual");
            item.setCategory(casual);
            casual.getItems().add(item);
            itemService.add(item);

            //search Size//
            Sizes size11 = sizeService.getSizeByName("M");
            Sizes size22 = sizeService.getSizeByName("S");
            Sizes size33 = sizeService.getSizeByName("XS");

            //create ItemDetails 1
            ItemDetails itemDetails1 = new ItemDetails();
            itemDetails1.setQtyOnHand(5);
            itemDetails1.setUnitPrice(750.00);
            itemDetails1.setItem(item);
            itemDetails1.setSizes(size11);
            item.getItemDetails().add(itemDetails1);
            size11.getItemDetails().add(itemDetails1);
            itemDetailsService.add(itemDetails1);

            // create ItemDetails 2
            ItemDetails itemDetails2 = new ItemDetails();
            itemDetails2.setQtyOnHand(12);
            itemDetails2.setUnitPrice(1250.00);
            itemDetails2.setItem(item);
            itemDetails2.setSizes(size22);
            item.getItemDetails().add(itemDetails2);
            size22.getItemDetails().add(itemDetails2);
            itemDetailsService.add(itemDetails2);

            //create ItemDetails 3
            ItemDetails itemDetails3 = new ItemDetails();
            itemDetails3.setQtyOnHand(8);
            itemDetails3.setUnitPrice(1150.00);
            itemDetails3.setItem(item);
            itemDetails3.setSizes(size33);
            item.getItemDetails().add(itemDetails3);
            size33.getItemDetails().add(itemDetails3);
            result = itemDetailsService.add(itemDetails3);

            Set<ItemDetails> all = new HashSet<ItemDetails>();
            all.add(itemDetails3);
            all.add(itemDetails2);
            all.add(itemDetails1);
            item.setItemDetails(all);
            
            

            //create shipping info
            ShippingInfo shippingInfo = new ShippingInfo();
            shippingInfo.setAddressLine1("No20/2 2st Lane");
            shippingInfo.setPostalCode("80562");
            shippingInfo.setfName("Kamal");
            shippingInfo.setlName("De Silva");
            shippingInfo.setCity("Mathara");
            shippingInfo.setCountry("Sri Lanka");
            shippingInfo.setContactNum("07762655");
            
            //Create User
            User user = new User();
            user.setCustomerFirstName("Kamal");
            user.setCustomerLastName("De silva");
            user.setCustomerEmail("Kamal@gmail.com");
            user.setUserName("kamal");
            user.setPassword("kamal1234");
            user.setShippinInfo(shippingInfo);
            ////result = userService.add(user);
            

            //Create ShoppingCart
            ShoppingCart cart = new ShoppingCart();
            cart.setAddedDate("2017/10/11");
            cart.setNumberOfItems(0);
            cart.setTotal(0.00);
            user.setShoppingCart(cart);
            
            result = userService.add(user);
  
            
            //Search User by Name
            User search = userService.getUserByNam("kamal");
            System.out.println(search.getCustomerLastName() + ")))))))))))))))))))))))))))))))))))");

            //Search Cart by User
            ShoppingCart cart1 = search.getShoppingCart();
            System.out.println(cart1.getAddedDate() + ")))))))))))))))))))))))))))))))))))");

            //Search Item by Decription
            Item item1 = itemService.getItemByDescription("Short top");
            System.out.println(item1.getDescription() + ")))))))))))))))))))))))))))))))))))))))");

            //Search Size by Name
            Sizes sizeByName = sizeService.getSizeByName("S");
            System.out.println(sizeByName.getSizeEU() + ")))))))))))))))))))))))))))))))))))))))");
            Sizes sizeByName1 = sizeService.getSizeByName("M");
            System.out.println(sizeByName1.getSizeEU() + ")))))))))))))))))))))))))))))))))))))))");

            //Search Item detail by Size & Item
            ItemDetails itemDetail = itemDetailsService.getItemDetailsBySizeAndItem(sizeByName, item1);
            System.out.println(itemDetail.getQtyOnHand() + ")))))))))))))))))))))))))))))))))))))))");
            ItemDetails itemDetail1 = itemDetailsService.getItemDetailsBySizeAndItem(sizeByName1, item1);
            System.out.println(itemDetail1.getQtyOnHand() + ")))))))))))))))))))))))))))))))))))))))");

            //create Shopping Cart Detail 1
            ShoppingCartDetails shoppingCartDetail = new ShoppingCartDetails();
            shoppingCartDetail.setOrderQty(2);
            shoppingCartDetail.setShoppingCart(cart1);
            shoppingCartDetail.setItemDetails(itemDetail);
            cart1.getShoppingCartDetails().add(shoppingCartDetail);
            result = cartDetailsService.add(shoppingCartDetail);

            //create Shopping Cart Detail 2
            ShoppingCartDetails shoppingCartDetail1 = new ShoppingCartDetails();
            shoppingCartDetail1.setOrderQty(3);
            shoppingCartDetail1.setShoppingCart(cart1);
            shoppingCartDetail1.setItemDetails(itemDetail1);
            cart1.getShoppingCartDetails().add(shoppingCartDetail1);
            result = cartDetailsService.add(shoppingCartDetail1);

*/

            
/*  
            //Delete Item Details
            List<ItemDetails> itemdetailList = itemDetailsService.getAll();
            for(ItemDetails itemDetails : itemdetailList){
                if(itemDetails.getItem().getItemCode().equals(1)){
                    itemDetailsService.delete(itemDetails.getId());
                }
            }
            //Delete Item
            result = itemService.delete(1);
*/           


/*          
            //Delete Shopping Cart Details
            List<ShoppingCartDetails> cartdetailList = cartDetailsService.getAll();
            for(ShoppingCartDetails cartDetails : cartdetailList){
                if(cartDetails.getShoppingCart().getID().equals(1)){
                    itemDetailsService.delete(cartDetails.getId());
                }
            }
            //Delete Shopping Cart
            result = cartService.delete(1);
*/            


/*
            //Create Payment Method 1
            PaymentMethod paymentMethod = new PaymentMethod();
            paymentMethod.setPaymentMethod("Debit Cards");
            
            //Create Payment Method 2
            PaymentMethod paymentMethod1 = new PaymentMethod();
            paymentMethod.setPaymentMethod("Paypal Credit");
            
            //Create Payment Method 3
            PaymentMethod paymentMethod2 = new PaymentMethod();
            paymentMethod.setPaymentMethod("Electronic Checks");
            
            //Create Payment Method 4
            PaymentMethod paymentMethod3 = new PaymentMethod();
            paymentMethod.setPaymentMethod("International Currencies");

            //Create Payment Method 5
            PaymentMethod paymentMethod4 = new PaymentMethod();
            paymentMethod.setPaymentMethod("PayPal");
            
            //Create Payment Method 6
            PaymentMethod paymentMethod5 = new PaymentMethod();
            paymentMethod.setPaymentMethod("Purchasing Cards");
            
            //Create Payment 1
            Payment payment = new Payment();
            //payment.set
*/


/*
            User getUser = userService.getUserByNam("Kamal");

            //Creat Order 1 
            Orders orders = new Orders();
            orders.setOrderAmount(20000);
            orders.setDiscount(1000);
            orders.setOrderDate("2017/10/11");
            orders.setUser(getUser);
            ordersService.add(orders);
            
            OrderDetails orderDetails = new  OrderDetails();
            orderDetails.setOrder(orders);
            orderDetails.setOrderQty(0);
            orderDetails.setCartDetailID(1);
            orderDetails.setDescription("Aaaaaaaaaa");
            orderDetailsService.add(orderDetails);
*/            

            System.out.println("*****************************");
            System.out.println("*****************************");
            System.out.println("*****************************");
        } catch (Exception ex) {
            System.out.println("----------------    exeption here=   " + ex + "---------------------------");
            System.out.println("----------------    exeption here=   " + ex + "---------------------------");
            System.out.println("----------------    exeption here=   " + ex + "---------------------------");
            System.out.println("----------------    exeption here=   " + ex + "---------------------------");

        }
        if (result) {
            return "Success";
        } else {
            return "Error";
        }
    }

}
