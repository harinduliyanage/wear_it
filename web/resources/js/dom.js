$('#add-New-Size-btn').click(function (){
    var sizes={size:$('#sizes-txt').val(),sizeUK:$('#sizeUK-txt').val(),sizeUS:$('#sizeUS-txt').val(),sizeEU:$('#sizeEU-txt')};
   $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/addNewSize",
      contentType: 'application/json',
      dataType: 'json',
      data: JSON.stringify(sizes),
      success:function(data){
            alert(data.msg);
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
     
    
    
    });