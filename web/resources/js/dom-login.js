/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$('#login-form').submit(function (event){
    $('#loaderDiv').css("display","block");
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
                  location.href = "http://localhost:8084/wear_it_1.2/index.jsp";
              }
         },
         error: function (error) {
           alert('Error is :'+error.toString());
         }

      });
    }, 3000);
  
});

$('#log-out-btn').click(function (){
    $.ajax({
        type: 'POST',
        url: "/wear_it_1.2/userLogOut",
        success:function(data){
           if(data.code ===401){
                alert(data.msg);
           }
           if(data.code===200){
               location.href = "http://localhost:8084/wear_it_1.2/index.jsp";
           }
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
        
   });
});