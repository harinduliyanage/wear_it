$('#add-New-Size-btn').click(function (){
    var A={size:$('#sizes-txt').val(),sizeUK:$('#sizeUK-txt').val(),sizeUS:$('#sizeUS-txt').val(),sizeEU:$('#sizeEU-txt').val()};
    var sizes=JSON.stringify(A);
    alert(sizes);
    $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/addNewSize",
      contentType: 'application/json',
      dataType: 'json',
      data: (sizes),
      success:function(data){
            alert(data.msg);
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});