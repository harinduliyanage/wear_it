/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$("#btn-delete").click(function(){
    $("table tbody").find('input[name="record"]').each(function(){
        if($(this).is(":checked")){
            var shoppingCartId=$(this).parent("td").text();
            $.ajax({
                    type: 'POST',
                    url : "/wear_it_1.2/deleteShoppingCartDetailsById",
                    data:{id:shoppingCartId},
                    success:function(data){
                        location.href = "http://localhost:8084/wear_it_1.2/checkout";

                    },
                    error: function (error) {
                      alert('Error is :'+error.toString());
                    }
                 });
           $(this).parents("tr").remove();
        }
    });
    
});

$('#buy-btn').click(function (){
    var name=$('#userName').text();
    $('#myModelLoad-btn').click();
    setTimeout(function(){
        $.ajax({
        type: 'POST',
       url : "/wear_it_1.2/placeOrder",
       data:{userName:name},
       success:function(data){
                $('#loaderDiv').css("display","none");
                $('#someTxt').css("display","none");
                $('#danger-alert').css("display","block");
        },
        error: function (error) {
            alert('Error is :'+error.toString());
        }
    });
        
        
        
        
    },4000);

});


