/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$('#combo-sizeName').change(function (){
    $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/getItemDetails",
      success:function(data){
            for(var i=0;i<data.length;i++){
              if(data[i].sizes.sizes === $('#combo-sizeName').val() ){
                    $('#unitPrice-txt-size').text(data[i].unitPrice);
                    $('#text-qtyOnHand').val(data[i].qtyOnHand);
              }
            }
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});



$('#addToCartButton').click(function (){
    var sizeName=$('#combo-sizeName').val();
    var orderQty=$('#orderQty').text();
    var description=$('#aaaaaaaa').text();
    var unitPrice=$('#unitPrice-txt-size').text();
    var log=$('#userLog').text();
    
    alert(sizeName);
    alert(orderQty);
    alert(description);
    alert(unitPrice);
    alert(log);
    if(sizeName!==null && orderQty!==null && description!==null && unitPrice!==null){
        alert("Successs");
    }
 
//    $.ajax({
//      type: 'POST',
//      url : "/wear_it_1.2/getItemDetails",
//      data:{
//          size:sizeName,
//          orderQty:orderQty,
//          description:description,
//          unitPrice:unitPrice
//      },
//      success:function(data){
//          location.href = "http://localhost:8084/wear_it_1.2/checkout";
//      },
//      error: function (error) {
//        alert('Error is :'+error.toString());
//      }
//   });
});
