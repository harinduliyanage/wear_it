/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$('#signUp-1st-btn').click(function (){
    var name=$('#name-txt').val();
    var phone=$('#phone-txt').val();
    var email=$('#email-txt').val();
    var pw=$('#psw-txt').val();
    
    console.log(name+"----"+phone+"---"+email+"--"+pw);
//    if (name!==null && phone!==null && email!==null && pw!==null){
//        $('#signUp-1st').css('display','none'); 
//    }    
});

