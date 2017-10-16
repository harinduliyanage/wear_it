$(document).ready(function (){
    getTreadingIems();
});
        

function getTreadingIems(){
    var price="$90";
    var description="short Top";
    var fragment='<div class="col-md-3 item-grid simpleCart_shelfItem"><!--//Item Start-->\n\
                        <div class=" mid-pop">\n\
                            <div class="pro-img">\n\
                                <img src="resources/images/pc4.jpg" class="img-responsive" alt="">\n\
                                <div class="zoom-icon ">\n\
                                <a class="picture" href="resources/images/pc4.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>\n\
                                <a href="single"><i class="glyphicon glyphicon-menu-right icon"></i></a>\n\
                            </div>\n\
                        </div>\n\
                        <div class="mid-1">\n\
                            <div class="women">\n\
                                <div class="women-top">\n\
                                <span>Men</span>\n\
                                <h6><a href="single">"'+description+'"</a></h6>\n\
                            </div>\n\
                                <div class="img item_add">\n\
                                <a href="#"><img src="resources/images/ca.png" alt=""></a>\n\
                        </div>\n\
                        <div class="clearfix"></div>\n\
                    </div>\n\
                    <div class="mid-2">\n\
                        <p ><label>$100.00</label><em class="item_price">"'+price+'"</em></p>\n\
                        <div class="block">\n\
                        <div class="starbox small ghosting"> </div>\n\
                    </div>\n\
                <div class="clearfix"></div>\n\
                </div>\n\
                </div>\n\
                </div>\n\
                </div>';
    //Trading Item To Add Row class
    $('#trading-Items').append('<div class="mid-popular" id="myRow"><!--//Row Started--></div><!--//Row End-->');
    for(var i=0;i<20;i++){
        
        $("#trading-Items").append(fragment);     
        
        
    }
}
