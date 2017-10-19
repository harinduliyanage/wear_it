$(document).ready(function (){
    getAllCategory();
    getAllItem();
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

$('#delete-item-btn').click(function (){
    $.ajax({
      type: 'POST',
      url : "/wear_it_1.2/deleteItem",
      data: {description:$('#delete-item-combo').val()},
      success:function(data){
            getAllItem();  
            alert(data.msg);
      },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
   });
});

function getAllItem(){
    $.ajax({
      type: 'GET',
      url : "/wear_it_1.2/getAllItems",
      success:function(data){
            for (var i = 0; i < data.length; i++) {
                var option = new Option(data[i].description, data[i].description); 
                var option1 = new Option(data[i].description, data[i].description); 
                $('#item-desc-combo').append($(option));
                $('#delete-item-combo').append($(option1));
               
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

$('#add-itemDetails-btn').click(function (){
    var unitPrice=$('#unitPrice-txt').val();
    var qtyOnHand=$('#qtyOnHand-txt').val();
    var sizeName=$('#size-name-combo-itemDetails').val();
    var itemDescription=$('#item-desc-combo').val();
    alert(unitPrice+"//"+qtyOnHand+"//"+sizeName+"///"+itemDescription);
});

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
