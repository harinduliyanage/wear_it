/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Harindu.sul
 */
@Entity
@Table(name = "SHOPPINGCART_DETAILS")
@AssociationOverrides({
    @AssociationOverride(name = "primaryKey.ShoppingCart",
        joinColumns = @JoinColumn(name = "SHOPPINGCART_ID")),
    @AssociationOverride(name = "primaryKey.ITEM_DETAILS",
        joinColumns = @JoinColumn(name = "ITEMDETAILS_ID")) })
public class ShoppingCartDetails {
    
}
