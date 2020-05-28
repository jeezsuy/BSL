
        var values= [];
        var values_description=[]
        var values_module=[];	
        var csv = "";
        var desc="";
        var mod="";
     // Store Comma separated values in this variable;
      //  var javaScriptVar="<%out.print(n1);%>";
  
  var today1 = new Date().toJSON(); 
  


        
        var today = new Date();

        
        var time_start=new Date();
        
        
       // var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();

        var end_time = today.getHours() + ":" + today.getMinutes()+2 + ":" + today.getSeconds();

        
        var dd = today.getDate();

        var mm = today.getMonth() + 1; //January is 0!

        var yyyy = today.getFullYear();

         

        if (dd < 10) {

          dd = '0' + dd;

        }

         

        if (mm < 10) {

          mm = '0' + mm;

        }

 

   // return str;
         

        today = mm + '/' + dd + '/' + yyyy;
        
 
  var dt = new Date();
  dt.setMinutes( dt.getMinutes() + 2.5 );
       
       
    

        function launch_selected(){
         
         //alert(1);
 var j;
 
 var k;
         
         for (var i=1;i<64;i++){
                 j="c"+i;
              k="s"+i;
              
         //     alert(j);
              
          
          if(document.getElementById(j).checked){
           
        //  alert(1);
           
           document.getElementById(k).click();
           
          }
         }
         
        }
        
        
        function sleep(milliseconds) {
        	//alert(1);
        	  var start = new Date().getTime();
        	  for (var i = 0; i < 1e7; i++) {
        	    if ((new Date().getTime() - start) > milliseconds){
        	      break;
        	    }
        	  }
        	}

function addProduct(){
 
          

    var checkboxes = $("#dataTable tr input:checked");

    if (checkboxes.length > 0) { 
    
      $.each(checkboxes, function (index, checkbox) {
      
        var tr = $(checkbox).closest("tr");
          
        var value = tr.find("td:eq(0)").html();
        var description=tr.find("td:eq(1)").html();
        var module=tr.find("td:eq(2)").html();
    
        values.push(value);
        values_description.push(description);
        values_module.push(module);
    
        csv = values.join();
        desc=values_description.join();
        mod=values_module.join();
    
        //tr.remove();
          
      });
  
 // alert(1);
      //alert(today);
      
   //  sleep(5000); 
swal({
 title : "Are you sure?",
 text : "You have selected: "+csv+"",
 type : "warning",
 showCancelButton : true,
 cancelButtonColor:"#FF0000",
 confirmButtonColor : "#008000",
 confirmButtonText : "Yes, Execute It!",
 closeOnConfirm : false
}, function(isConfirm) {
 if (!isConfirm){
	 location.reload();
	  return;
 }

 var data = null;
 

 
 launch_selected();
 
 
 

 

 
 


         var xhr = new XMLHttpRequest();
         xhr.withCredentials = true;

         

         xhr.open("POST", "https://144.21.93.75/ords/pdb1/ocust/ocusttestcases/create/"); 
         xhr.setRequestHeader("p_test_case_name", csv); 
         xhr.setRequestHeader("p_module", mod); 
         xhr.setRequestHeader("p_start_time", time_start); 
         xhr.setRequestHeader("p_end_time", dt); 
         xhr.setRequestHeader("p_status", "Completed"); 
         xhr.setRequestHeader("p_execution_date", today); 
         xhr.setRequestHeader("p_executed_by", "admin"); 
         xhr.setRequestHeader("p_description",desc); 
         xhr.setRequestHeader("cache-control", "no-cache"); 
         xhr.setRequestHeader("postman-token", "68db9506-8998-6a99-c940-aa1be889e7cb");
        // sleep(60000);

         xhr.send(data);

         xhr.addEventListener("readystatechange", function () {
            if (this.status===200) {
      
      
     
      
      
            	swal({
            		 imageUrl:'images/rolling.gif',
            	    title: 'Starting executing: '+csv+'',
            	    text: 'Please wait till test Execution window opens',
            	    timer: 60000,
            	    showConfirmButton: false
            	  })
          
              //getProductByCatalog();
              
            }
            else if(this.status ===400)
           {
            var J_imp = null;
            J_imp = JSON.parse(this.responseText);
            
           }
           else
           {    
//            swal({
//             title : "Failed" ,
//             text : "An error has occurred while processing",
//             type : "error"
//            });   
           }
            
          });
                   
})
  

                
          
           

            
                    
                
         
                if ($.fn.DataTable.isDataTable('#subsiteList1')) {  
                           $('#subsiteList1').DataTable().destroy();  
                                   }  
                       $('#subsiteList1 tbody').empty();  
            
              
          }
          else {
              
        	  swal({
                  title : "Alert" ,
                  text : "Please select atleast 1 Test Case to Execute",
                  type : "info"
                 });
          }
          
    
 
                 
                
              

}


