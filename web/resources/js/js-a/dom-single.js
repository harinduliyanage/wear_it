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
    
    if(sizeName!==null && orderQty!==null && description!==null && unitPrice!==null){
        if(log !== "Log In" ){
            $.ajax({
            type: 'POST',
            url : "/wear_it_1.2/addShoppingCartDetailss",
            data:{
                size:sizeName,
                orderQty:orderQty,
                description:description,
                unitPrice:unitPrice,
                userName : log
            },
            success:function(data){
                location.href = "http://localhost:8084/wear_it_1.2/checkout";
            },
            error: function (error) {
              alert('Error is :'+error.toString());
            }
         });
        
        }else{
            $('#myModelLoad-btn').click();
        }
    }  
});

$('#model-form').submit(function (event){
   event.stopPropagation();
   event.preventDefault(); 
   setTimeout(function(){
        $.ajax({
           type: 'POST',
           url: "/wear_it_1.2/userLogIn",
           data: {userName:$('#login-userName').val(),
               password:$('#login-pw').val()},
         success:function(data){
              if(data.code ===401){
                  $('#loaderDiv').css("display","none");
                  $('#danger-alert').css("display","block");
              }
              if(data.code===200){
                  $('#loaderDiv').css("display","none");
                  $('#success-alert').css("display","block");
                  location.href = "http://localhost:8084/wear_it_1.2/index.jsp";
              }
         },
         error: function (error) {
           alert('Error is :'+error.toString());
         }

      });
    }, 1000);
  
});

$('#signUp-model-btn').click(function (){
    location.href = "http://localhost:8084/wear_it_1.2/register";
});