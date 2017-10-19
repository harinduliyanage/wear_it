//$('button[type=submit]').click(function(e) {
//    e.preventDefault();
//    //Disable submit button
//    $(this).prop('disabled',true);
//    
//    var form = document.forms[0];
//    var formData = new FormData(form);
//    	
//    // Ajax call for file uploaling
//    var ajaxReq = $.ajax({
//      url : 'fileUpload',
//      type : 'POST',
//      data : formData,
//      cache : false,
//      contentType : false,
//      processData : false,
//      xhr: function(){
//        //Get XmlHttpRequest object
//         var xhr = $.ajaxSettings.xhr() ;
//        
//        //Set onprogress event handler 
//         xhr.upload.onprogress = function(event){
//          	var perc = Math.round((event.loaded / event.total) * 100);
//          	$('#progressBar').text(perc + '%');
//          	$('#progressBar').css('width',perc + '%');
//         };
//         return xhr ;
//    	},
//    	beforeSend: function( xhr ) {
//    		//Reset alert message and progress bar
//    		$('#alertMsg').text('');
//    		$('#progressBar').text('');
//    		$('#progressBar').css('width','0%');
//              }
//    });
//    
//    $('#item-adding-form').submit(function (event){
//        event.stopPropagation();
//        event.preventDefault();
//        var form = document.forms[0];
//        var formData = new FormData(form);
//    });