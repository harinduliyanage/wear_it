$(document).ready(function (){
    $.ajax({
      type: 'GET',
      url : "/wear_it_1.2/getAllSizes",
      success:function(data){
            for (var i = 0; i < data.length; i++) {
                var option = new Option(data[i].sizes, data[i].sizes); 
                $('#update-size-combo').append($(option));
            }
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
    
});

$('#update-size-combo').change(function (){
    $.ajax({
      type: 'GET',
      url : "/wear_it_1.2/getSizeByName",
      success:function(data){
         $('#update-sizeUK-txt').val(data.sizeUK)
         $('#update-sizeUS-txt').val(data.sizeUS)
         $('#update-sizeEU-txt').val(data.sizeEU)
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
    
});



$('#create-new-size-form').submit(function (event){
    event.stopPropagation();
    event.preventDefault();
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

$('#update-size-form').submit(function (event){
    event.stopPropagation();
    event.preventDefault();
    $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/updateSize",
      data: {size:$('#update-size-combo').val(),
          sizeUK:$('#update-sizeUK-txt').val(),
          sizeUS:$('#update-sizeUS-txt').val(),
          sizeEU:$('#update-sizeEU-txt').val()},
      success:function(data){
            alert(data.msg);
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});




