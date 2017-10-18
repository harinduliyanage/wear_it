$('#add-New-Size-btn').click(function (){
    $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/addNewSize",
      data: {size:$('#sizes-txt').val(),
          sizeUK:$('#sizeUK-txt').val(),
          sizeUS:$('#sizeUS-txt').val(),
          sizeEU:$('#sizeEU-txt').val()},
      success:function(data){
            alert(data.msg);
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});




