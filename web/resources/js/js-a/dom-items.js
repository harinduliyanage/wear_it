$(document).ready(function (){
    getAllCategory();
    getAllItem();
    getAllSizes();
    $('#numOfItem').val(0);
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

$('#itemDetails-adding-form').submit(function (e){
    e.stopPropagation();
    e.preventDefault();
    var unitPrice=$('#unitPrice-txt').val();
    var qtyOnHand=$('#qtyOnHand-txt').val();
    var sizeName=$('#size-name-combo-itemDetails').val();
    var itemDescription=$('#item-desc-combo').val();
    var markup = "<tr><td><input type='checkbox' name='record'></td><td>"+itemDescription
           +"</td><td>" +sizeName
           + "</td><td>" + unitPrice
           + "</td><td>"+qtyOnHand
           +"</td></tr>";
    $("table tbody").append(markup);
    var h=$('#numOfItem').val();
    $('#numOfItem').val(Number(h)+Number(1));
    
});

$("#btn-delete").click(function(){
    var i=0;
    $("table tbody").find('input[name="record"]').each(function(){
        if($(this).is(":checked")){
            i++;
            $(this).parents("tr").remove();
        }
    });
    var h=$('#numOfItem').val();
    $('#numOfItem').val(Number(h)-Number(i));
});

$("#btn-addItemDetails").click(function(){
    var i=$('#numOfItem').val();
    if(i==0){
        alert("Add ItemDetails Frist");
    }else{
            var unitPrice;
            var qtyOnHand;
            var sizeName;
            var itemDescription;
            var itemDetailsArray=[];
        for (var j=0 ; j< i ; j++){
            var itemDetail=new ItemDetailsDTO();
            unitPrice=document.getElementById("putTable").rows[j+1].cells[3].innerHTML;
            qtyOnHand=document.getElementById("putTable").rows[j+1].cells[4].innerHTML;
            sizeName=document.getElementById("putTable").rows[j+1].cells[2].innerHTML;
            itemDescription=document.getElementById("putTable").rows[j+1].cells[1].innerHTML;
            itemDetail.setItemDescription(itemDescription);
            itemDetail.setSizeName(sizeName);
            itemDetail.setQtyOnHand(qtyOnHand);
            itemDetail.setUnitPrice(unitPrice);
            itemDetailsArray.push(itemDetail);   
            alert(unitPrice+qtyOnHand+sizeName+itemDescription);
        }
        var a=JSON.stringify(itemDescription);
        var b=JSON.stringify(itemDetailsArray);
        sendDataBaseToData(a,b);  
    }  
});

function sendDataBaseToData(itemDescription,itemDetailsArray){
     $.ajax({
        type: "POST",
        url: '/wear_it_1.2/addItemDetalsToItem',
        data: ({ itemDescription : itemDescription , itemDetailsArray :itemDetailsArray}),
        async: false,
        success: function(data) {
            alert(data.msg);
        },
        error: function(error) {
            alert('Error occured :'+error);
        }
    });
}

