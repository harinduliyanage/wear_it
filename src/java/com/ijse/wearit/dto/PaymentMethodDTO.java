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
 * @author Harindu.sul
 */
@Component
public class PaymentMethodDTO extends SuperDTO{
    private Integer id;
    private String paymentMethod;
    private List<PaymentDTO> paymentDTOS
            ;

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
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the paymentDTOS
     */
    public List<PaymentDTO> getPaymentDTOS() {
        return paymentDTOS;
    }

    /**
     * @param paymentDTOS the paymentDTOS to set
     */
    public void setPaymentDTOS(List<PaymentDTO> paymentDTOS) {
        this.paymentDTOS = paymentDTOS;
    }
    public void addPaymentDTO(PaymentDTO paymentDTOS) {
        this.paymentDTOS.add(paymentDTOS);
    }
    
}
