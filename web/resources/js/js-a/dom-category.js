/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function (){
    getAllCategory(); 
});

function getAllCategory(){
    $('#update-category-combo').empty();
    $('#delete-category-combo').empty();
    $.ajax({
      type: 'GET',
      url : "/wear_it_1.2/getAllCategory",
      success:function(data){
            for (var i = 0; i < data.length; i++) {
                var option = new Option(data[i].name, data[i].name); 
                var option1 = new Option(data[i].name, data[i].name); 
                $('#update-category-combo').append($(option));
                $('#delete-category-combo').append($(option1));
                if(i===0){
                    $('#update-categoryName-txt').val(data[i].name);
                    
                }
            }
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
}

$('#create-new-Category-form').submit(function (event){
    event.stopPropagation();
    event.preventDefault();
    $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/addNewCategory",
      data: {categoryName:$('#category-name-txt').val()},
      success:function(data){
            alert(data.msg);
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});

$('#update-Category-form').submit(function (event){
    event.stopPropagation();
    event.preventDefault();
    $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/updateCategory",
      data: {category:$('#update-category-combo').val(),
          newValue:$('#update-categoryName-txt').val()},
      success:function(data){
            alert(data.msg);
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});

$('#delete-category-btn').click(function (){
    $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/deleteCategory",
      data: {category:$('#delete-category-combo').val()},
      success:function(data){
            alert(data.msg);
            getAllCategory();
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});

$('#update-category-combo').change(function (){
    $.ajax({
      type: 'GET',
      url : "/wear_it_1.2/getCategoryByName",
      data:{size:$('#update-category-combo').val()},
      success:function(data){
         $('#update-categoryName-txt').val(data.name);
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
    
});



