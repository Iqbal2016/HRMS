$("#country").change(function(){
    $('#city').find('option').remove().end(); //clear the city ddl
    var country = $(this).find("option:selected").text();
    alert(country);
    //do the ajax call
    $.ajax({
        url:'',
        type:'GET',
        data:{city:country},
        dataType:'json',
        cache:false,
        success:function(data){

        data=JSON.parse(data); //no need if dataType is set to json
         var ddl = document.getElementById('city');                      

         for(var c=0;c<obj.length;c++)
              {              
               var option = document.createElement('option');
               option.value = obj[c];
               option.text  = obj[c];                           
               ddl.appendChild(option);
              }


    },
        error:function(jxhr){
        alert(jxhr.responseText);

    }
    }); 

});