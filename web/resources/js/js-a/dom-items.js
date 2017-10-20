$(document).ready(function (){
    getAllCategory(); 
    getAllSizes();
});

function getAllSizes(){
    $.ajax({
      type: 'GET',
      url : "/wear_it_1.2/getAllSizes",
      success:function(data){
            for (var i = 0; i < data.length; i++) {
                var option = new Option(data[i].sizes, data[i].sizes); 
                $('#size-name-combo-itemDetails').append($(option));
               
            }
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
    
}

function getAllCategory(){
    $('#category-combo').empty();
    $.ajax({
      type: 'GET',
      url : "/wear_it_1.2/getAllCategory",
      success:function(data){
            for (var i = 0; i < data.length; i++) {
                var option = new Option(data[i].name, data[i].name); 
                $('#category-combo').append($(option));
                if(i===0){
                    $('#category-txt').val(data[i].name);
                }
            }
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
}

$('#category-combo').change(function (){
   $('#category-txt').val($('#category-combo').val());
});
//
////$('#item-adding-form').submit(function (event){
//        event.stopPropagation();
//        event.preventDefault();
//        var form = document.forms[0];
//        var formData = new FormData(form);
//        $.ajax({
//        type: 'POST',
//        url : "/wear_it_1.2/addNewItem",
//        data: formData,
//        cache : false,
//        contentType : false,
//        processData : false,
//        success:function(data){
//            alert(data.msg);
//        },
//      error: function (error) {
//        alert('Error is :'+error.toString());
//      }
//  });
//});

//$('#pp').click(function (){
//    var list=[{
//       "id":"001",
//       "sizeDTO":"",
//       "itemDTO":"",
//       "unitPrice":0.05,
//       "qtyOnHand":50
//            
//    },{
//      "id":"001",
//       "sizeDTO":"",
//       "itemDTO":"",
//       "unitPrice":0.01,
//       "qtyOnHand":10  
//    },{
//      "id":"001",
//       "sizeDTO":"",
//       "itemDTO":"",
//       "unitPrice":0.02,
//       "qtyOnHand":20  
//    },{
//      "id":"001",
//       "sizeDTO":"",
//       "itemDTO":"",
//       "unitPrice":0.03,
//       "qtyOnHand":30  
//    },{
//       "id":"001",
//       "sizeDTO":"",
//       "itemDTO":"",
//       "unitPrice":0.04,
//       "qtyOnHand":40 
//    }];
//    $.ajax({
//    url : '/wear_it_1.2/addItemDetailsToItem',
//    data : $.toJSON(list),
//    type : 'POST', //<== not 'GET',
//    contentType : "application/json; charset=utf-8",
//    dataType : 'json',
//    error : function() {
//        console.log("error");
//    },
//    success : function(arr) {
//            alert();
//        var testArray = arr.testArray;
//         $.each(function(i,e) {
//             document.writeln(e);
//         });
//    }
//  });
//});
