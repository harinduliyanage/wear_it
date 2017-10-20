/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function ItemDetailsDTO() {
    var _id;
    var _sizeName;
    var _itemDescription;
    var _unitPrice;
    var _qtyOnHand;

    
     this.getId=function () {
         return this._id;
     },
    this.getSizeName=function () {
        return this._sizeName;
    },
    this.getItemDescription=function () {
        return this._itemDescription;
    },
    this.getUnitPrice=function () {
        return this._unitPrice;
    },
    this.getQtyOnHand=function () {
        return this._qtyOnHand;
    },
    
    this.setId=function (id) {
         this._id=id;
    },
    this.setSizeName=function (sizeName) {
         this._sizeName=sizeName;
    },
    
    this.setItemDescription=function (itemDescription) {
         this._itemDescription=itemDescription;
    },
    this.setUnitPrice=function (unitPrice) {
         this._unitPrice=unitPrice;
    },
    this.setQtyOnHand=function (qty) {
         this._qtyOnHand=qty;
    };

}

