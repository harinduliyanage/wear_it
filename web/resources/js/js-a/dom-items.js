//$('#item-adding-form').submit(function (event){
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