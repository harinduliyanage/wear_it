/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.OrdersDAO;
import com.ijse.wearit.dao.custom.PaymentDAO;
import com.ijse.wearit.dao.custom.PaymentMethodDAO;
import com.ijse.wearit.dao.custom.ShoppingCartDAO;
import com.ijse.wearit.dao.custom.ShoppingCartDetailsDAO;
import com.ijse.wearit.dao.custom.UserDAO;
import com.ijse.wearit.model.Orders;
import com.ijse.wearit.model.Payment;
import com.ijse.wearit.model.PaymentMethod;
import com.ijse.wearit.model.ShoppingCart;
import com.ijse.wearit.model.ShoppingCartDetails;
import com.ijse.wearit.model.User;
import com.ijse.wearit.service.custom.OrdersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersDAO ordersDAOImpl;
    
    @Autowired
    private ShoppingCartDetailsDAO shoppingCartDetailsDAO;
    
    @Autowired
    private UserDAO userDAO;
    
    @Autowired
    private ShoppingCartDAO shoppingCartDAOImpl;
    
    @Autowired
    private PaymentMethodDAO paymentMethodDAO;
    
    @Autowired
    private PaymentDAO paymentDAO;
    
    @Override
    public boolean add(Orders t) throws Exception {
        return ordersDAOImpl.add(t);
    }

    @Override
    public boolean update(Orders t) throws Exception {
        return ordersDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return ordersDAOImpl.delete(id);
    }

    @Override
    public Orders search(Integer id) throws Exception {
        return ordersDAOImpl.search(id);
    }

    @Override
    public List<Orders> getAll() throws Exception {
        return ordersDAOImpl.getAll();
    }
    @Override
    public boolean addOrderss(String userName) throws Exception {
        boolean result = false;
        User user = userDAO.getUserByUserName(userName);
        ShoppingCart shoppingCart = user.getShoppingCart();
        
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setPaymentMethod("Credit Card");
        paymentMethodDAO.add(paymentMethod);
        
        Payment payment = new Payment();
        payment.setPaymentMethod(paymentMethod);
        payment.setPaymentResponseMessage("Paid");
        payment.setUserIdOrSessionId("2");
        paymentDAO.add(payment);
        
        Orders orders =  new Orders();
        orders.setUser(user);
        orders.setPayment(payment);
        orders.setOrderDate(shoppingCart.getAddedDate());
        orders.setOrderAmount(shoppingCart.getTotal());
        orders.setDiscount(2000.00);
        
        ordersDAOImpl.add(orders);
        
        List<ShoppingCartDetails> cartDetailsList = shoppingCartDetailsDAO.getDetailsByCart(shoppingCart);
        for(ShoppingCartDetails shoppingCartDetails : cartDetailsList){
            shoppingCartDetailsDAO.delete(shoppingCartDetails.getId());
        }
        
        shoppingCart.setTotal(0);
        result = shoppingCartDAOImpl.update(shoppingCart);
        return result;
    }
}
