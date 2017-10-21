/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.ItemDAO;
import com.ijse.wearit.dao.custom.ItemDetailsDAO;
import com.ijse.wearit.dao.custom.ShoppingCartDAO;
import com.ijse.wearit.dao.custom.ShoppingCartDetailsDAO;
import com.ijse.wearit.dao.custom.SizeDAO;
import com.ijse.wearit.dao.custom.UserDAO;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.ShoppingCartDetails;
import com.ijse.wearit.model.Sizes;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.ShoppingCartDetailsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ABC
 */
@Service
@Transactional
public class ShoppingCartDetailsServiceImpl implements ShoppingCartDetailsService{

    @Autowired
    private ShoppingCartDetailsDAO shoppingCartDetailsDAOImpl;
    
    @Autowired
    private ItemDAO itemDAOImpl;
    
    @Autowired
    private ItemDetailsDAO itemDetailsDAOImpl;
    
    @Autowired
    private SizeDAO sizeDAOImpl;
    
    @Autowired
    private UserDAO userDAOImpl;
    
    @Autowired
    private ShoppingCartDAO shoppingCartDAOImpl;
    
    @Override
    public boolean add(ShoppingCartDetails t) throws Exception {
        return shoppingCartDetailsDAOImpl.add(t);
    }

    @Override
    public boolean update(ShoppingCartDetails t) throws Exception {
        return shoppingCartDetailsDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return shoppingCartDetailsDAOImpl.delete(id);
    }

    @Override
    public ShoppingCartDetails search(Integer id) throws Exception {
        return shoppingCartDetailsDAOImpl.search(id);
    }

    @Override
    public List<ShoppingCartDetails> getAll() throws Exception {
        return shoppingCartDetailsDAOImpl.getAll();
    }

    @Override
    public ShoppingCartDetails getByItemDetail(Integer id) throws Exception  {
        return shoppingCartDetailsDAOImpl.getByItemDetail(id);
    }

    @Override
    public List<ShoppingCartDetails> getDetailsByCart(ShoppingCart shoppingCart) throws Exception {
        List<ShoppingCartDetails> shoppingCartDetailses = shoppingCartDetailsDAOImpl.getDetailsByCart(shoppingCart);
        return shoppingCartDetailses;
    }

    @Override
    public boolean addShoppingCartDetailTShopin(String description, String custName, String size, int orderQty, double unitPrice) throws Exception {
        User user = userDAOImpl.getUserByUserName(custName);
        ShoppingCart shoppingCart = userDAOImpl.getShoppingCartByUserId(user.getUserID());
        
        Item item = itemDAOImpl.getItemByDescription(description);
        Sizes sizes = sizeDAOImpl.getSizeByName(size);
        ItemDetails itemDetails = itemDetailsDAOImpl.getItemDetailsBySizeAndItem(sizes, item);
        System.out.println(")))))))))))))))");
        System.out.println(itemDetails.getItem().getDescription()+")))))))))))))))");
        System.out.println(itemDetails.getSizes().getSizes()+")))))))))))))))");
        double amount = unitPrice * orderQty;
        
        ShoppingCartDetails shoppingCartDetails = new ShoppingCartDetails();
        shoppingCartDetails.setShoppingCart(shoppingCart);
        shoppingCartDetails.setItemDetails(itemDetails);
        shoppingCartDetails.setOrderQty(orderQty);
        shoppingCartDetails.setAmount(amount);
        
        boolean result = shoppingCartDetailsDAOImpl.add(shoppingCartDetails);
        return result;
    }


}
