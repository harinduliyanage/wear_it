/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$("#btn-delete").click(function(){
    $("table tbody").find('input[name="record"]').each(function(){
        if($(this).is(":checked")){
            $(this).is(":checked").fadeOut('slow', function(c){
		$(this).parents("tr").remove();
	});
        }
    });
    setAmount();
});

