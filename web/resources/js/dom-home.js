$(document).ready(function (){
    getTreadingIems();
});


function getTreadingIems(){
    var fragment;

    
    var old="resources/images/pc4.jpg";
    //ajax calling to get All Items
    $.ajax({
        type: 'GET',
        url: "/wear_it_1.2/getAllItems",
        success:function(data){
           for(var i=0;i<4;i++){
               fragment="<div class=\"mid-popular\">\n" +
"					<div class=\"col-md-3 item-grid simpleCart_shelfItem\">\n" +
"					<div class=\" mid-pop\">\n" +
"					<div class=\"pro-img\">\n" +
"						<img src=\"resources/images/pc4.jpg\" class=\"img-responsive\" alt=\"\">\n" +
"						<div class=\"zoom-icon \">\n" +
"						<a class=\"picture\" href=\"resources/images/pc4.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\"><i class=\"glyphicon glyphicon-search icon \"></i></a>\n" +
"						<a href=\"single.html\"><i class=\"glyphicon glyphicon-menu-right icon\"></i></a>\n" +
"						</div>\n" +
"						</div>\n" +
"						<div class=\"mid-1\">\n" +
"						<div class=\"women\">\n" +
"						<div class=\"women-top\">\n" +
"							<span>"+data[i].category.name+"</span>\n" +
"							<h6><a href=\"single\">"+data[i].description+"</a></h6>\n" +
"							</div>\n" +
"							<div class=\"img item_add\">\n" +
"								<a href=\"singleItem?description="+data[i].description+"\"><img src=\"resources/images/ca.png\" alt=\"\"></a>\n" +
"							</div>\n" +
"							<div class=\"clearfix\"></div>\n" +
"							</div>\n" +
"							<div class=\"mid-2\">\n" +
"								<p ><label>$100.00</label><em class=\"item_price\">$70.00</em></p>\n" +
"								  <div class=\"block\">\n" +
"									<div class=\"starbox small ghosting\"> </div>\n" +
"								</div>\n" +
"								\n" +
"								<div class=\"clearfix\"></div>\n" +
"							</div>\n" +
"							\n" +
"						</div>\n" +
"					</div>\n" +
"					</div>";
                
                $('#trading-Items').append(fragment);
               $('img[src="' + old + '"]').attr('src', data[i].paths);
               $('a[href="' + old + '"]').attr('href', data[i].paths);
               
           }
           
        },
      error: function (error) {
        alert('Error is :'+error.toString());
      }
        
    });
   
    
}
    

