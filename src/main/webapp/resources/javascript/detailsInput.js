 $(document).ready(
  
   
  function () {
    $( "#date" ).datepicker({
    	dateFormat: 'yyyy-mm-dd',
      changeMonth: true, 
      changeYear: true  
    }),
     
	     
    $( "#assetReliseDate" ).datepicker({
    	dateFormat: 'yyyy-mm-dd',
      changeMonth: true, 
      changeYear: true  
    }), 
    $( "#frDate1" ).datepicker({
    	dateFormat: 'yyyy-mm-dd',
        changeMonth: true, 
        changeYear: true  
      }), $( "#resultDate1" ).datepicker({
      	dateFormat: 'yyyy-mm-dd',
        changeMonth: true, 
        changeYear: true  
      }),
      $( "#courtOrder2" ).datepicker({
        	dateFormat: 'yyyy-mm-dd',
          changeMonth: true, 
          changeYear: true  
        }),
      
      
  /*  $('#time').timepicker({ 'scrollDefault': 'now' }) ,*/
    
  
    
    $('#reliseTime').timepicker({ 'scrollDefault': 'now' }), $("#district").change(function(){
	    $('#subDistrict').find('option').remove().end(); //clear the city ddl
	    var districtval = $(this).find("option:selected").text();
	    
	     
    $.ajax({
    	
	        url:myContextPath+'/getThanaList',
	        type:'post',
	        data:{'distName':districtval},
	        cache:false,
	        success:function(data){
	      var dataArray = data.split('$');
	      var tname = document.getElementById('subDistrict'); 
	      
	      var option = document.createElement('option');
            
         option.value ="" ;
         option.text  ="SELECT A VALUE";                           
        
         tname.appendChild(option);
         

	         for(var c=0;c<dataArray.length;c++)
	              {    
	        	
	               var option = document.createElement('option');
	            
	               option.value = dataArray[c] ;
	               option.text  = dataArray[c] ;                           
	              
	               tname.appendChild(option);
	              
	              }


	    },
	        error:function(jxhr){
	        alert(jxhr.responseText);

	    } 
	    });  

	});
    
    $('#ttabs ul li a').click(function () {location.hash = $(this).attr('href');});
    
    var params = window.location.hash;
    $("a[href$='"+params+"']").closest('li').attr('class', 'active');
    $("a[href$='"+params+"']").attr('class', 'active').attr('aria-expanded', true);
    $(params).attr('class', 'tab-pane active');
  }
 
);
 
 $.urlParam = function(name){
		var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		return results[1] || 0;
	}

 
 