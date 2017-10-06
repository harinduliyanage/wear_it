/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.dto;

import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author ABC
 */
@Component
public class PaymentMethodDTO extends SuperDTO{
    private Integer id;
    private String paymentMethod;
    private List<PaymentDTO> payment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<PaymentDTO> getPayment() {
        return payment;
    }

    public void setPayment(List<PaymentDTO> payment) {
        this.payment = payment;
    }
    
    
}
