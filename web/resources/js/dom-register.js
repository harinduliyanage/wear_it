/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$('#signUp-1st-btn').submit(function (event){
    event.stopPropagation();
    event.preventDefault();
     $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/registeUser",
      data: {Fname:$('#Fname-txt').val(),
          Lname:$('#Lname-txt').val(),
          pw:$('#psw-txt').val(),
          postal:$('#postal-txt').val(),
          phone:$('#phone-txt').val(),
          address:$('#address-txt').val(),
          city:$('#city-txt').val(),
          country:$('#country-txt').val(),
          mail:$('#email-txt').val()},
          success:function(data){
           if(data.code ===200){
                $('#success-alert').css('display','block');
                $('#danger-alert').css('display','none');
           }else{
            $('#danger-alert').css('display','block');
             $('#success-alert').css('display','none');
            }
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});
